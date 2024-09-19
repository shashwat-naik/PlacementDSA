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

public class RemoveDup_sorted {
    static Node remDuplicate(Node head) {
        Node temp = head;
        while (temp != null && temp.next != null) {
            Node nextNode = temp.next;
            while (nextNode != null && nextNode.data == temp.data) {
                Node duplicate = nextNode;
                nextNode = nextNode.next;

            }
            temp.next = nextNode;
            if (nextNode != null)
                nextNode.prev = temp;

            temp = temp.next;
        }
        return head;
    }

    public static void printList(Node head) {
        if (head == null)
            System.out.println("Doubly Linked list empty");

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);

        System.out.println("Original doubly linked list:");
        printList(head);

        remDuplicate(head);
        System.out.println("\nDoubly linked list after removing duplicates:");
        printList(head);
    }
}
