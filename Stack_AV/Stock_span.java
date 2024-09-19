import java.util.Arrays;
import java.util.Stack;

public class Stock_span {
    public static void span(int[] arr, int n, int[] s) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        s[0] = 1;

        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            s[i] = (st.isEmpty()) ? (i + 1) : (i - st.peek());
            st.push(i);
        }
    }

    public static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = { 100, 80, 60, 70, 60, 75, 85 };
        int n = arr.length;
        int[] s = new int[n];

        span(arr, n, s);
        print(s);
    }
}
