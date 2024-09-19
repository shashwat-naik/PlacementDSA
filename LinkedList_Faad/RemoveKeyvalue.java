class Node {
    int data;
    Node next;
    Node prev;

    Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class RemoveKeyvalue {
    static Node OccRemove(Node head, int key) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == key) {
                if (temp == head) {
                    head = temp.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else {
                    Node nextNode = temp.next;
                    Node prevNode = temp.prev;

                    if (nextNode != null) {
                        nextNode.prev = prevNode;
                    }
                    if (prevNode != null) {
                        prevNode.next = nextNode;
                    }
                }
            }
            temp = temp.next;
        }
        return head;
    }

    public static void printList(Node head) {
        if (head == null) {
            System.out.println("Doubly Linked list empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(10);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(8);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.prev = head.next.next.next;
        head.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.prev = head.next.next.next.next;
        head.next.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next.prev = head.next.next.next.next.next;
        head.next.next.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next.next.prev = head.next.next.next.next.next.next;

        System.out.println("Original doubly linked list:");
        printList(head);

        head = OccRemove(head, 2);

        System.out.println("Doubly linked list after removing key 2:");
        printList(head);
    }
}
