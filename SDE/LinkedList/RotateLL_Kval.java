
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

public class RotateLL_Kval {
    static Node insert(Node head, int val) {
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

    static Node rotate(Node head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;
            
        Node temp = head;
        int length = 1;

        while (temp.next != null) {
            ++length;
            temp = temp.next;
        }
        temp.next = head;
        k = k % length;
        int end = length - k;

        while (end-- != 0)
            temp = temp.next;
        head = temp.next;
        temp.next = null;

        return head;
    }

    static void print(Node head) {
        while (head.next != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println(head.data);
    }

    public static void main(String args[]) {
        Node head = null;
        // inserting Node
        head = insert(head, 1);
        head = insert(head, 2);
        head = insert(head, 3);
        head = insert(head, 4);
        head = insert(head, 5);

        System.out.println("Original list: ");
        print(head);

        int k = 2;
        Node newHead = rotate(head, k);// calling function for rotating right of the nodes by k times

        System.out.println("After " + k + " iterations: ");
        print(newHead);// list after rotating nodes

    }
}
