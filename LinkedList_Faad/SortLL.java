/* Brute Approach: Convert the linked list into array and then sort the array, followed by converting the array into linked list 
 * Optimal Approach: 
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

public class SortLL {
    static Node merging(Node list1, Node list2) {
        Node replica = new Node(-1);
        Node temp = replica;

        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if (list1 != null)
            temp.next = list1;
        else
            temp.next = list2;

        return replica.next;
    }

    static Node middle(Node head) {   // tortoise hare
        if (head == null || head.next == null)
            return head;

        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static Node sort(Node head) {
        if (head == null || head.next == null)
            return head;
        Node middle = middle(head);
        Node right = middle.next;
        middle.next = null;
        Node left = head;

        left = sort(left);
        right = sort(right);

        return merging(left, right);
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
        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(5);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(1);

        System.out.print("Original Linked List: ");
        print(head);

        // Sort the linked list
        head = sort(head);

        System.out.print("Sorted Linked List: ");
        print(head);
    }
}
