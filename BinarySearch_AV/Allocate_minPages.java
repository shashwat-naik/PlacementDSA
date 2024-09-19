public class Allocate_minPages {
    public static boolean validity(int[] arr, int n, int k, int max) {
        int student = 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum > max) {
                student++;
                sum = arr[i];
            }
            if (student > k)
                return false;
        }
        return true;
    }

    public static int findPg(int[] arr, int n, int m) {
        // Sum calculation for the declaration below in <end> variable.
        int sum = 0;
        if (n < m)
            return -1;
            
        int max = arr[0];

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            max = (arr[i] > max ? arr[i] : max);
        }

        int start = arr[n - 1];
        int end = sum;
        int ans = Integer.MAX_VALUE;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (validity(arr, n, m, mid)) {
                ans = mid;
                end = mid - 1;
            } else
                start = mid + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 34, 67, 90 };
        int m = 2;

        System.out.println("Minimum number of pages = " + findPg(arr, arr.length, m));
    }
}
