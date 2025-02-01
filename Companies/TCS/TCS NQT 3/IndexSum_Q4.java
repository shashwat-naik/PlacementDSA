   
 public class IndexSum_Q4 {
    public static void main(String[] args) {
        int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
        int totalSum = 0;
        int leftSum = 0;

        // Calculate total sum of the array
        for (int num : arr) {
            totalSum += num;
        }

        // Iterate through the array and check for equilibrium index
        for (int i = 0; i < arr.length; i++) {
            // Total sum minus current element gives the right sum
            totalSum -= arr[i];

            // Check if left sum is equal to right sum
            if (leftSum == totalSum) {
                System.out.println(i);
                return;
            }

            // Update left sum for the next iteration
            leftSum += arr[i];
        }

        // If no equilibrium index is found, print -1
        System.out.println(-1);
    }
}
