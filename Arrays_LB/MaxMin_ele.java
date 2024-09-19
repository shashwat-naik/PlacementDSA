// Q- From a array elements find the max and min element
/* Approach 1: Imagine a arr to have a single element so for which the max and min are same, then for every other element that you iterate into compare with the current value if matches the criteria then update the value.
 * Approach 2: Sort the whole array in ascending order and point arr[0] as min and arr[n-1] as max.
 */

public class MaxMin_ele {
    static void getMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("\nMaximum element: " + max);
        System.out.println("Minimum element: " + min);
    }

    public static void main(String[] args) {
        int[] arr = { 6, 2, 3, 4, 1, 9 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        getMaxMin(arr);
    }
}
