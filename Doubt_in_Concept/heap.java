/*
 * In a heap to find out the information follow this:
 * Node => i
 * Parent(i) => i/2
 * left child(i) => 2 x i
 * right child(i) => 2 x i + 1
 */

 public class heap {
    static void insert(int A[], int n, int value) {
        if (n >= A.length) {
            System.out.println("Heap overflow");
            return;
        }
        A[n] = value;
        int i = n;
        while (i > 0) {
            int parent = (i - 1) / 2;
            if (A[parent] < A[i]) {
                int temp = A[parent];
                A[parent] = A[i];
                A[i] = temp;
                i = parent;
            } else {
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        int currentSize = 0;

        // Initialize the heap with existing elements
        int[] initialElements = { 50, 30, 40, 10, 5, 20, 30 };
        for (int value : initialElements) {
            insert(arr, currentSize, value);
            currentSize++;
        }

        // Insert new element
        insert(arr, currentSize, 60);
        currentSize++;

        // Print the heap
        for (int i = 0; i < currentSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
