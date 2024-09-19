import java.util.*;

public class Recursion {
    public static void print(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        print(n - 1);
    }

    public static void sum(int i, int n, int add) {

        if (i == n) {
            add += i;
            System.out.println(add);
            return;
        }
        add += i;
        sum(i + 1, n, add);
    }

    public static int factorial(int n) {
        if (n == 1)
            return 1;
        int store = factorial(n - 1);
        int ans = n * store;
        return ans;
    }

    public static void fibonacci(int i, int j, int n) {
        if (n == 0)
            return;
        int c = i + j;
        System.out.print(c + " ");
        fibonacci(j, c, n - 1);
    }

    public static int powerCalc(int base, int pow) {
        if (pow == 0)
            return 1;
        if (base == 0)
            return 0;

        int power1 = powerCalc(base, pow - 1);
        int power2 = base * power1;
        return power2;
    }

    public static int powerCalcI(int base, int pow) {
        if (base == 0)
            return 0;
        if (pow == 0)
            return 1;

        // even pow
        if (pow % 2 == 0)
            return powerCalcI(base, pow / 2) * powerCalcI(base, pow / 2);
        // odd pow
        else
            return powerCalcI(base, pow / 2) * powerCalcI(base, pow / 2) * base;
    }

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        print(x);

        System.out.println();
        sum(1, x, 0);

        int result = factorial(x);
        System.out.println(result);

        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        fibonacci(a, b, x - 2);

        int ans = powerCalc(2, x);
        int ansI = powerCalcI(2, x);
        System.out.println("\n" + ans + " O(n)");
        System.out.println(ansI + " O(logn)");
        sc.close();
    }
}
