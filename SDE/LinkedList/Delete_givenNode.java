class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Delete_givenNode {
    static Node insertNode(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return head;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
        return head;
    }

    static Node getNode(Node head, int val) {
        if (head == null)
            return null;
        while (head.data != val)
            head = head.next;

        return head;
    }

    static void delete(Node t) {
        if (t == null)
            return;
        t.data = t.next.data;
        t.next = t.next.next;
        return;
    }

    static void print(Node head) {
        if (head == null)
            return;
        while (head.next != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println(head.data);
    }

    public static void main(String args[]) {
        Node head = null;

        head = insertNode(head, 1);
        head = insertNode(head, 4);
        head = insertNode(head, 2);
        head = insertNode(head, 3);

        System.out.println("Given Linked List: ");
        print(head);
        Node t = getNode(head, 2);

        delete(t);

        System.out.println("Linked List after deletion: ");
        print(head);
    }
}
