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

public class IntersectionPt_2LL {
    static Node intersection(Node headA, Node headB) {
        if (headA == null || headB == null)
            return null;

        Node a = headA;
        Node b = headB;

        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }

    static Node insertNode(Node head, int data) {
        Node newNode = new Node(data);

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

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertNode(head, 1);
        head = insertNode(head, 9);
        head = insertNode(head, 1);
        head = insertNode(head, 2);
        head = insertNode(head, 4);
        Node head1 = head;
        head = head.next.next.next;
        Node headSec = null;
        headSec = insertNode(headSec, 3);
        Node head2 = headSec;
        headSec.next = head;
        
        System.out.print("List1: ");
        print(head1);
        System.out.print("List2: ");
        print(head2);
        
        // checking if intersection is present
        Node answerNode = intersection(head1, head2);
        if (answerNode == null)
            System.out.println("No intersection\n");
        else
            System.out.println("The intersection point is " + answerNode.data);

    }
}
