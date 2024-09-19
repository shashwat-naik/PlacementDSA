/* Brute Approach: Convert the linked list into array performed the sorting combining again to a linkedlist.
 * Optimal Approach: Without using any space merging the linked list after performing sorting.
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

public class MergeLL {
    static Node sorting(Node list1, Node list2) {
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
        if (list2 != null)
            temp.next = list2;

        return replica.next;
    }

    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        ;
    }

    public static void main(String[] args) {
        Node list1 = new Node(1);
        list1.next = new Node(1);
        list1.next.next = new Node(5);

        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);

        System.out.print("First sorted linked list: ");
        print(list1);

        System.out.print("Second sorted linked list: ");
        print(list2);

        Node mergedList = sorting(list1, list2);

        System.out.print("Merged sorted linked list: ");
        print(mergedList);
    }
}
