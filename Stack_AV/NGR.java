import java.util.Stack;

public class NGR {
    public static long[] NGE(long[] arr, int n) {
        long[] result = new long[n];
        Stack<Long> s = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
        // for (int i = 0; i <= n - 1; i++) { // variation for NGL code
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }

            result[i] = s.isEmpty() ? -1 : s.peek();
            s.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        long[] arr = { 11, 13, 21, 3 };
        int n = arr.length;

        long[] result = NGE(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " -> " + result[i]);
        }
    }
}
