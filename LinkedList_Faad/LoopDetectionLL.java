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

public class LoopDetectionLL {
    static Node detectLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Loop detected, find the start of the loop
                Node start = head;
                while (start != slow) {
                    start = start.next;
                    slow = slow.next;
                }
                return start; 
            }
        }
        return null; 
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        // Create a loop in the linked list
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third; 

        Node loopNode = detectLoop(head);

        if (loopNode != null) {
            System.out.println("Loop detected in the linked list at node with data: " + loopNode.data);
        } else {
            System.out.println("No loop detected in the linked list.");
        }
    }
}
