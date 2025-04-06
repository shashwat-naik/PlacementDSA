public class MinSizeSubarr_Sum {
    public static int minSubArrSum(int target, int[] arr) {
        int n = arr.length, left = 0, minLength = Integer.MAX_VALUE, sum = 0;

        for (int right = 0; right < n; right++) {
            sum += arr[right];

            while (sum >= target) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                }
                sum -= arr[left++];
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 2, 4, 3 };
        int target = 7;
        int ans = minSubArrSum(target, arr);
        System.out.println("The min size of SubArr sum is " + ans);
    }
}