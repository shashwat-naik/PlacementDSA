import java.util.HashSet;
import java.util.Scanner;

public class PYQ11 {
    // Q1 Ways to climb stairs

    public static int count(int n) {
        if (n <= 1)
            return 1;

        int prev1 = 1, prev2 = 1, curr = 0;
        for (int i = 2; i <= n; i++) {
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return curr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Ways to climb " + n + " stairs: " + count(n));
        sc.close();
    }

    // Q2 Count number of repeated digits within the range of number
    public static int repeated(int n) {
        HashSet<Integer> s = new HashSet<>();
        while (n != 0) {
            int d = n % 10;
            if (s.contains(d))
                return 0;
            s.add(d);
            n /= 10;
        }
        return 1;
    }

    public static int calculate(int l, int r) {
        int ans = 0;
        for (int i = l; i < r + 1; i++)
            ans += repeated(i);

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(calculate(l, r));
        sc.close();
    }
}
