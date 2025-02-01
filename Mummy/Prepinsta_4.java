import java.util.Scanner;

public class Prepinsta_4 {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower and upper bound: ");
        long lower = sc.nextLong();
        long upper = sc.nextLong();
        System.out.print("Enter the size of the pair: ");
        int k = sc.nextInt();

        long evenCount = (upper / 2) - ((lower - 1) / 2);
        long oddCount = (upper - lower + 1) - evenCount;

        long[][] dp = new long[k + 1][2];
        dp[0][0] = 1;

        for (int i = 1; i <= k; i++) {
            dp[i][0] = (dp[i - 1][0] * evenCount + dp[i - 1][1] * oddCount) % MOD;
            dp[i][1] = (dp[i - 1][0] * oddCount + dp[i - 1][1] * evenCount) % MOD;
        }
        System.out.println(dp[k][0]);
        sc.close();
    }
}