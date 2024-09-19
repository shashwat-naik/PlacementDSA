class Node {
    int data;
    Node next;
    Node random;

    Node(int x, Node nextNode, Node randomNode) {
        this.data = x;
        this.next = nextNode;
        this.random = randomNode;
    }

    Node(int x) {
        this.data = x;
        this.next = null;
        this.random = null;
    }
}

public class ClonedLL_random_ptr {
    static void insertBetween(Node head) {
        Node temp = head;
        while (temp != null) {
            Node nextEle = temp.next;
            Node copy = new Node(temp.data);
            copy.next = nextEle;
            temp.next = copy;
            temp = nextEle;
        }
    }

    static void connectPtr(Node head) {
        Node temp = head;
        while (temp != null) {
            Node copyNode = temp.next;

            if (temp.random != null) {
                copyNode.random = temp.random.next;
            } else {
                copyNode.random = null;
            }
            temp = temp.next.next;
        }
    }

    static Node CopyList(Node head) {
        Node temp = head;
        Node dummyNode = new Node(-1);
        Node result = dummyNode;

        while (temp != null) {
            result.next = temp.next;
            result = temp.next;
            temp.next = temp.next.next;
            temp = temp.next;
        }
        return dummyNode.next;
    }

    static Node clone(Node head) {
        if (head == null)
            return null;
        insertBetween(head);
        connectPtr(head);

        return CopyList(head);
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print("Data: " + head.data);
            if (head.random != null) {
                System.out.print(", Random: " + head.random.data);
            } else {
                System.out.print(", Random: null");
            }
            System.out.println();
            // Move to the next node
            head = head.next;
        }
    }

    public static void main(String[] args) {
        // Example linked list: 7 -> 14 -> 21 -> 28
        Node head = new Node(7);
        head.next = new Node(14);
        head.next.next = new Node(21);
        head.next.next.next = new Node(28);

        // Assigning random pointers
        head.random = head.next.next;
        head.next.random = head;
        head.next.next.random = head.next.next.next;
        head.next.next.next.random = head.next;

        System.out.println("Original Linked List with Random Pointers:");
        print(head);

        Node clonedList = clone(head);

        System.out.println("\nCloned Linked List with Random Pointers:");
        print(clonedList);
    }

}
