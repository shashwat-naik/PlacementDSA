// Q- Sort the given array with values in 0,1 & 2 
/* Brute approach:  sorting algo O(nlogn)
 * Better approach: iterating along the array and storing the count for each number throughout the array. O(2n)
 * Optimal approach: dutch national flag O(n)
*/

public class Sort_0_1_2 {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortArray(int[] arr, int n) {
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 2, 0 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        sortArray(arr, arr.length);
        System.out.println("\nAfter sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}