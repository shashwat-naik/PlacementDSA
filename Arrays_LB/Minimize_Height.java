import java.util.Arrays;

public class Minimize_Height {
    public static int minDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int small = arr[0] + k;
        int large = arr[n - 1] - k;
        int ans = arr[n - 1] - arr[0];

        int min = 0, max = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] - k < 0)
                continue;

            min = Math.min(arr[i] - k, small);
            max = Math.max(arr[i - 1] + k, large);
            ans = Math.min(ans, max - min);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 9, 12, 16, 20 };
        int result = minDiff(arr, arr.length, 3);

        System.out.println("Minimum difference is: " + result);
    }
}