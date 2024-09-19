/* Brute Approach: Linkedlist traversing and applying (n+1)/2 for odd and n/2+1 for even.
 * Optimal approach: Using turtoise hare method, that is the concept of two pointer, slower pointer moves by one element and the faster travels by two element
 */

import java.util.*;

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

public class MiddleEle {
    static Node middle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node middleNode =middle(head);

        System.out.println("The middle node value is: " + middleNode.data);
    }
}
