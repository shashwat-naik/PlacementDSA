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

public class RemoveNode_k_grp {
    static Node reverse(Node head, int k) {
        if (head == null || k == 1)
            return head;

        Node dummy = new Node(0);
        dummy.next = head;

        Node cur = dummy, nex = dummy, prev = dummy;

        // Length of the linked list
        int count = 0;
        while (cur.next != null) {
            cur = cur.next;
            count++;
        }

        while (count >= k) {
            cur = prev.next;
            nex = cur.next;
            for (int i = 1; i < k; i++) {
                cur.next = nex.next;
                nex.next = prev.next;
                prev.next = nex;
                nex = cur.next;
            }
            prev = cur;
            count -= k;
        }
        return dummy.next;
    }

    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(9);
        head.next.next.next.next.next = new Node(2);

        System.out.print("Original Linked List: ");
        print(head);

        head = reverse(head, 4);

        System.out.print("Reversed Linked List: ");
        print(head);
    }
}
