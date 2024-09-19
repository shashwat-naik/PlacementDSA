
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

public class RemoveNnode {
    static Node removeNthfromEnd(Node head, int n) {
        Node start = new Node(n);
        start.next = head;
        Node fast = start;
        Node slow = start;

        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        } 
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int N = 4;
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);

        // Delete the Nth node from the end and print the modified linked list
        head = removeNthfromEnd(head, N);
        print(head);
    }
}
