import java.util.ArrayList;

public class Rat_in_Maze {
    private static void solve(int i, int j, int[][] maze, int n, ArrayList<String> ans, String move, int[][] vis,
            int[] di, int[] dj) {

        if (i == n - 1 && j == n - 1) {
            ans.add(move);
            return;
        }
        
        String direction = "DLRU";
        for (int index = 0; index < 4; index++) {
            int nexti = i + di[index];
            int nextj = j + dj[index];

            if (nexti >= 0 && nextj >= 0 && nexti < n && nextj < n && vis[nexti][nextj] == 0
                    && maze[nexti][nextj] == 1) {
                vis[i][j] = 1;
                solve(nexti, nextj, maze, n, ans, move + direction.charAt(index), vis, di, dj);
                vis[i][j] = 0;
            }
        }
    }

    public static ArrayList<String> Path(int[][] m, int n) {
        int vis[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                vis[i][j] = 0;
            }
        }
        int di[] = { +1, 0, 0, -1 };
        int dj[] = { 0, -1, 1, 0 };
        ArrayList<String> ans = new ArrayList<>();
        if (m[0][0] == 1)
            solve(0, 0, m, n, ans, "", vis, di, dj);

        return ans;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] a = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 1, 1, 0, 0 }, { 0, 1, 1, 1 } };

        Rat_in_Maze obj = new Rat_in_Maze();
        ArrayList<String> res = obj.Path(a, n);
        if (res.size() > 0) {
            for (int i = 0; i < res.size(); i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        } else {
            System.out.println(-1);
        }
    }
}
