public class NthRoot_num_BinarySearch {
    public static int multiply(int mid, int n, int m) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= mid;

            if (result > m)
                return 2;
        }
        if (result == m)
            return 1;

        return 0;
    }

    public static int NthRoot(int n, int m) {
        int low = 1, high = m;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midN = multiply(mid, n, m);

            if (midN == 1)
                return mid;
            else if (midN == 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 9, m = 1953125;
        int ans = NthRoot(n, m);
        System.out.println("The answer is: " + ans);
    }
}
