
public class Median_rowWise_SortedArr {
    public static int upperBound(int[] arr, int x, int n) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return ans;
    }

    public static int countEqual(int[][] arr, int m, int n, int x) {
        int count = 0;
        for (int i = 0; i < m; i++)
            count += upperBound(arr[i], x, n);

        return count;
    }

    public static int median(int[][] arr, int m, int n) {
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;

        for (int i = 0; i < m; i++) {
            low = Math.min(low, arr[i][0]);
            high = Math.max(high, arr[i][n - 1]);
        }
        int required = (n * m) / 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int smallEqual = countEqual(arr, m, n, mid);

            if (smallEqual <= required)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4, 5 },
                { 8, 9, 11, 12, 13 },
                { 21, 23, 25, 27, 29 }
        };
        int m = matrix.length;
        int n = matrix[0].length;
        int ans = median(matrix, m, n);
        System.out.println("The median element is: " + ans);
    }
}
