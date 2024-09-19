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

public class Adding2LL {
    static Node addition(Node list1, Node list2) {
        Node replica = new Node(0);
        Node temp = replica;
        int carry = 0;

        while (list1 != null || list2 != null || carry == 1) {
            int sum = 0;
            if (list1 != null) {
                sum += list1.data;
                list1 = list1.next;
            }
            if (list2 != null) {
                sum += list2.data;
                list2 = list2.next;
            }
            sum += carry;
            carry = sum / 10;
            Node x = new Node(sum % 10);
            temp.next = x;
            temp = temp.next;
        }
        return replica.next;
    }

    public static Node createList(int[] arr) {
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
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
        int[] arr1 = { 2, 4, 3 }; // Represents the number 342
        int[] arr2 = { 5, 6, 4 }; // Represents the number 465

        Node list1 = createList(arr1);
        Node list2 = createList(arr2);

        System.out.print("First Linked List: ");
        print(list1);

        System.out.print("Second Linked List: ");
        print(list2);

        Node result = addition(list1, list2);

        System.out.print("Resultant Linked List after addition: ");
        print(result);
    }
}
