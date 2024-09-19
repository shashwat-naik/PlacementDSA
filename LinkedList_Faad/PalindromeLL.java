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

public class PalindromeLL {
    public static Node reverseLL(Node head) {
        if (head == null || head.next == null)
            return head;
        Node newHead = reverseLL(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;

        return newHead;
    }

    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null)
            return true;
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node newHead = reverseLL(slow.next);
        Node first = head;

        Node second = newHead;
        while (second != null) {
            if (first.data != second.data) {
                reverseLL(newHead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverseLL(newHead);
        return true;
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
        // Create a linked list with
        // values 1, 5, 2, 5, and 1 (15251, a palindrome)
        Node head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(2);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(1);

        System.out.print("Original Linked List: ");
        print(head);

        if (isPalindrome(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}
