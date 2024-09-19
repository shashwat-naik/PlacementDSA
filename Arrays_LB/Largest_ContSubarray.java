/* 
 * Brute Approach: Iterate to every possible subarray from the elements inside the array. O(n^3)
 * Better Approach: Instead of iterating to each subarr, we take in sum for continuous subarr. O(n^2)
 * Optimal Approach: Kadanes algorithm O(n)
 */
public class Largest_ContSubarray {
    public static int SubArr(int[] arr, int n) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int start = 0, end = 0, tempStart = 0;

        for (int i = 0; i < n; i++) {
            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }

            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
        }

        // Print the subarray with the maximum sum
        System.out.print("The subarray with the largest sum is: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { -2, -3, -4, -1, -2, -1, -5, -3 };

        int maxSum = SubArr(arr, arr.length);

        // Print the maximum sum
        System.out.println("The maximum sum is: " + maxSum);
    }
}
