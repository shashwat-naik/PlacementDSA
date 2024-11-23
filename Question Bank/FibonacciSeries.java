public class FibonacciSeries {

    public static void main(String[] args) {
        int n = 10;
        int first = 0, second = 1;
        System.out.print(first + ", " + second);
        for (int i = 3; i <= n; i++) {
            int sum = first + second;
            first = second;
            second = sum;
            System.out.print(", " + sum);
        }
    }

    // Using recursion -------------------------------------------------------------------------------------
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
