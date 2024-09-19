/* Optimal approach I: iteration
 * Optimal approach II: recursion
 */
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

public class ReverseLL {
    static Node reverseI(Node head) {
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    static Node reverseII(Node head) {
        if (head == null || head.next == null)
            return head;
        Node newHead = reverseII(head.next);
        Node front = head.next;

        front.next = head;
        head.next = null;

        return newHead;
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);

        System.out.print("Original Linked List: ");
        print(head);

        head = reverseI(head);

        System.out.print("Reversed Linked List using iteration: ");
        print(head);

        head = reverseII(head);
        System.out.print("Reversed Linked List using reccursion: ");
        print(head);
    }
}
