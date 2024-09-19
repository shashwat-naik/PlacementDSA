import java.util.Stack;

public class NGL {
    public static long[] NGE(long[] arr, int n) {
        long[] result = new long[n];
        Stack<Long> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (s.isEmpty()) {
                result[i] = -1;
            }
            else if (s.peek() > arr[i]) {
                result[i] = s.peek();
            }
            else {
                while (!s.isEmpty() && s.peek() <= arr[i]) {
                    s.pop();
                }
                result[i] = s.isEmpty() ? -1 : s.peek();
            }
            s.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        long[] arr = {11, 13, 21, 3}; 
        int n = arr.length;

        long[] result = NGE(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " -> " + result[i]);
        }
    }
}
