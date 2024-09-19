import java.util.Stack;

public class Largest_recArea_Histogram {
    /*
     * public static int maxArea(int[] arr, int n) {
     * Stack<Integer> st = new Stack<>();
     * st.push(-1);
     * int width = arr[0];
     * 
     * int leftSmaller[] = new int[n];
     * int rightSmaller[] = new int[n];
     * 
     * for (int i = 0; i < n; i++) {
     * leftSmaller[i] = -1;
     * rightSmaller[i] = n;
     * }
     * int i = 0;
     * while (i < n) {ygyg
     * while (!st.empty() && st.peek() != -1 && arr[i] < arr[st.peek()]) {
     * rightSmaller[st.peek()] = (int) i;
     * st.pop();
     * }
     * if (i > 0 && arr[i] == arr[(i - 1)]) {
     * leftSmaller[i] = leftSmaller[(int) (i - 1)];
     * } else {
     * leftSmaller[i] = st.peek();
     * }
     * st.push(i);
     * i++;
     * }
     * for (i = 0; i < n; i++) {
     * width = Math.max(width, arr[i] * (rightSmaller[i] - leftSmaller[i] - 1));
     * }
     * return width;
     * }
     */

     public static long[] NSL(long[] arr) {
        long[] result = new long[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            result[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return result;
    }

    // Function to find the index of the Next Smaller to Right
    public static long[] NSR(long[] arr) {
        long[] result = new long[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            result[i] = st.isEmpty() ? arr.length : st.peek();
            st.push(i);
        }
        return result;
    }

    // Function to find the largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) {
        long max = 0;
        long[] nsl = NSL(hist);
        long[] nsr = NSR(hist);

        for (int i = 0; i < hist.length; i++) {
            long width = nsr[i] - nsl[i] - 1;
            long area = width * hist[i];
            max = Math.max(max, area);
        }
        return max;
    }

    public static void main(String[] args) {
        long[] hist = {6, 2, 5, 4, 5, 1, 6};
        long n = hist.length;
        System.out.println("Maximum area is " + getMaxArea(hist, n));
    }
}
