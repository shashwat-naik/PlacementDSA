public class Kadanes_algo {
    public static long maxSubarray(int[] nums) {
        long maxSum = Long.MIN_VALUE;
        long currSum = 0;

        for (int i = 0; i <= nums.length - 1; i++) {
            currSum += nums[i];
            maxSum = Math.max(maxSum, currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 2, 3, -1, -2, 4 };
        System.out.println(maxSubarray(nums));
    }
}
