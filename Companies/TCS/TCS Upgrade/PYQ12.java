import java.util.HashSet;
import java.util.Scanner;

public class PYQ12 {
    // Q1*** Count unique sums of squares and cubes
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashSet<Integer> uniqueSums = new HashSet<>();

        for (int i = 0; i * i <= n; i++) {
            int sq = i * i;
            for (int j = 0; j * j * j <= n; j++) {
                int cube = j * j * j;
                int sum = sq + cube;

                if (sum <= n) {
                    uniqueSums.add(sum); // HashSet will automatically ignore duplicates
                }
            }
        }
        System.out.println(uniqueSums.size());
        sc.close();
    }

    // Q2 Count ways
    public static int countWays(int n) {
        if (n == 1)
            return 0;
        if (n % 2 == 0)
            return 1 + countWays(n / 2);
        return 1 + Math.min(countWays(n + 1), countWays(n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = countWays(n);
        System.out.println(ans);
        sc.close();
    }
}
