class Node {
    int data;
    Node next;
    Node child;

    Node() {
        this.data = 0;
        this.next = null;
        this.child = null;
    }

    Node(int x) {
        this.data = x;
        this.next = null;
        this.child = null;
    }

    Node(int x, Node nextNode, Node childNode) {
        this.data = x;
        this.next = nextNode;
        this.child = childNode;
    }
}

public class FlatteningLL {
    public static Node merge(Node a, Node b) {
        Node temp = new Node(-1);
        Node result = temp;

        while (a != null && b != null) {
            if (a.data < b.data) {
                result.child = a;
                result = a;
                a = a.child;
            } else {
                result.child = b;
                result = b;
                b = b.child;
            }
            result.next = null;
        }
        if (temp.child != null) {
            temp.child.next = null;
        }
        return temp.child;
    }

    public static Node flattenLL(Node head) {
        if (head == null || head.next == null)
            return head;

        Node mergeHead = flattenLL(head.next);
        head = merge(head, mergeHead);
        return head;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.child;
        }
        System.out.println();
    }

    public static void printOriginal(Node head, int depth) {
        while (head != null) {
            System.out.print(head.data);

            if (head.child != null) {
                System.out.print("->");
                printOriginal(head.child, depth + 1);
            }
            if (head.next != null) {
                System.out.println();
                for (int i = 0; i < depth; ++i) {
                    System.out.print("| ");
                }
            }
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(5);
        head.child = new Node(14);

        head.next = new Node(10);
        head.next.child = new Node(4);

        head.next.next = new Node(12);
        head.next.next.child = new Node(20);
        head.next.next.child.child = new Node(13);

        head.next.next.next = new Node(7);
        head.next.next.next.child = new Node(17);

        System.out.println("Original linked list:");
        printOriginal(head, 0);

        Node flattened = flattenLL(head);
        System.out.print("\nFlattened linked list: ");
        print(flattened);
    }
}
