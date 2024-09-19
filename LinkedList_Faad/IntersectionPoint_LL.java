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

public class IntersectionPoint_LL {
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

    static Node findIntersection(Node headA, Node headB) {
        if (headA == null || headB == null)
            return null;

        Node temp1 = headA;
        Node temp2 = headB;

        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;

            if (temp1 == temp2)
                return temp1;

            if (temp1 == null)
                temp1 = headB;
            if (temp2 == null)
                temp2 = headA;
        }
        return headA;
    }

    static void print(Node head) {
        while (head.next != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println(head.data);
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertNode(head, 1);
        head = insertNode(head, 3);
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
        Node answerNode = findIntersection(head1, head2);
        if (answerNode == null)
            System.out.println("No intersection\n");
        else
            System.out.println("The intersection point is " + answerNode.data);
    }
}
