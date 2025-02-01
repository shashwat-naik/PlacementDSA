import java.util.Scanner;

public class Party_Planner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int budget = sc.nextInt();
            int n = sc.nextInt();

            if (budget == 0 && n == 0)
                break;

            int[] cost = new int[n];
            int[] fun = new int[n];

            for (int i = 0; i < n; i++) {
                cost[i] = sc.nextInt();
                fun[i] = sc.nextInt();
            }

            int[][] dp = new int[n + 1][budget + 1];

            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <= budget; j++) {
                    dp[i][j] = dp[i - 1][j];

                    if (j >= cost[i - 1])
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - cost[i - 1]] + fun[i - 1]);
                }
            }

            int maxFun = dp[n][budget];
            int minCost = 0;
            for (int i = 0; i <= budget; i++) {
                if (dp[n][i] == maxFun) {
                    minCost = i;
                    break;
                }
            }
            System.out.println(minCost + " " + maxFun);
        }
        sc.close();
    }
}
