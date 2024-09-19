public class LongestRepeatingSeq {
    public static int LongRepSeq(int x, String str) {
        int dp[][] = new int[x + 1][x + 1];

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                if (str.charAt(i - 1) == str.charAt(j - 1) && i != j) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[x][x];
    }

    public static int RepeatingSeq(String str) {
        int p = str.length();
        int result = LongRepSeq(p, str);

        return result;
    }

    public static void main(String[] args) {
        String str = "axxzxy";
        int ans = RepeatingSeq(str);
        System.out.println("Longest repeating subsequence is " + ans);
    }
}
