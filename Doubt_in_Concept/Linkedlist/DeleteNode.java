import java.util.Scanner;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteNode {
    public static void deleteNode(LinkedListNode<Integer> node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }

    // Helper function to print the linked list
    public static void printList(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a sample linked list: 4 -> 5 -> 1 -> 9
        LinkedListNode<Integer> head = new LinkedListNode<>(4);
        head.next = new LinkedListNode<>(5);
        head.next.next = new LinkedListNode<>(1);
        head.next.next.next = new LinkedListNode<>(9);

        System.out.println("Original list:");
        printList(head);

        // Delete the node with value 5
        LinkedListNode<Integer> nodeToDelete = head.next; // Node with value 5
        deleteNode(nodeToDelete);

        System.out.println("List after deleting node:");
        printList(head);
    }
}
