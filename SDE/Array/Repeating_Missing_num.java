public class Repeating_Missing_num {
    public static int[] RepeatMissingnum(int[] arr) {
        long n = arr.length;

        long SN = (n * (n + 1)) / 2;
        long S2N = (n * (n + 1) * (2 * n + 1)) / 6;

        long S = 0, S2 = 0;
        for (int i = 0; i < n; i++) {
            S += arr[i];
            S2 += (long) arr[i] * (long) arr[i];
        }
        long value1 = S - SN; // normal part
        long value2 = S2 - S2N; // square part

        value2 = value2 / value1;

        long x = (value1 + value2) / 2;
        long y = x - value1;

        int[] ans = { (int) x, (int) y };
        return ans;
    }

    public static void main(String[] args) {
        int[] a = { 3, 1, 2, 5, 4, 6, 7, 5 };
        int[] result = RepeatMissingnum(a);

        System.out.println("The repeating and missing numbers are: {" + result[0] + ", " + result[1] + "}");
    }
}
