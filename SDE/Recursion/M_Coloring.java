import java.util.ArrayList;
import java.util.List;

public class M_Coloring {
    public static boolean Safe(int node, List<List<Integer>> G, int[] color, int n, int col) {
        for (int i : G.get(node)) {
            if (color[i] == col)
                return false;
        }
        return true;
    }

    public static boolean Solve(int node, List<List<Integer>> G, int[] color, int n, int m) {
        if (node == n)
            return true;

        for (int i = 1; i <= m; i++) {
            if (Safe(node, G, color, n, i)) {
                color[node] = i;
                if (Solve(node + 1, G, color, n, m))
                    return true;
                color[node] = 0;
            }
        }
        return false;
    }

    public static boolean graphColoring(List<List<Integer>> G, int[] color, int c) {
        int n = G.size();
        return Solve(0, G, color, n, c);
    }

    public static void main(String[] args) {
        int N = 4, M = 3;
        List<List<Integer>> G = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            G.add(new ArrayList<>());
        }
        G.get(0).add(1);
        G.get(1).add(0);
        G.get(1).add(2);
        G.get(2).add(1);
        G.get(2).add(3);
        G.get(3).add(2);
        G.get(3).add(0);
        G.get(0).add(3);
        G.get(0).add(2);
        G.get(2).add(0);

        int[] color = new int[N];
        boolean ans = graphColoring(G, color, M);
        if (ans)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
