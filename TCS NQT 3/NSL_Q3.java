import java.util.Stack;

public class NSL_Q3 {
    public static long[] NearestSmall(long[] arr, int n) {
        long[] ans = new long[n];
        Stack<Long> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (s.isEmpty())
                ans[i] = -1;
            else if (s.peek() < arr[i])
                ans[i] = s.peek();
            else {
                while (!s.isEmpty() && s.peek() >= arr[i])
                    s.pop();
                ans[i] = s.isEmpty() ? -1 : s.peek();
            }
            s.push(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        long[] arr = { 1, 6, 4, 10, 2, 5 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
        long[] result = NearestSmall(arr, arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
