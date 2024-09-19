import java.util.ArrayList;

public class Recursion_lvl3 {
    public static void permutation(String str, String permute) {
        if (str.length() == 0) {
            System.out.print(permute + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);

            String newStr = str.substring(0, i) + str.substring(i + 1);
            permutation(newStr, permute + currChar);
        }
    }

    public static int cntPath(int row, int col, int n, int m) {
        if (row == n || col == m)
            return 0;
        if (row == n - 1 && col == m - 1)
            return 1;
        int downPath = cntPath(row + 1, col, n, m);
        int rightPath = cntPath(row, col + 1, n, m);

        return downPath + rightPath;
    }

    public static int arrangeTile(int n, int m) {
        if (n == m)
            return 2;
        if (n < m)
            return 1;

        int vertical = arrangeTile(n - m, m);
        int horizontal = arrangeTile(n - 1, m);
        return vertical + horizontal;
    }

    public static int invite(int n) {
        if (n <= 1)
            return 1;

        int solo = invite(n - 1);
        int pair = (n - 1) * invite(n - 2);

        return solo + pair;
    }

    // Q5
    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubset(int n, ArrayList<Integer> subset) {

        if (n == 0) {
            printSubset(subset);
            return;
        }
        subset.add(n);
        findSubset(n - 1, subset);

        subset.remove(subset.size() - 1);
        findSubset(n - 1, subset);
    }

    public static void main(String[] args) {
        String str = "abc";
        permutation(str, "");
        System.out.println();

        int n = 3, m = 3;
        int result = cntPath(0, 0, n, m); // startrow,startcol, totalrow, totalcol
        System.out.println(result);

        int x = 4, y = 2;
        System.out.println("Possibility to place tiles in room : " + arrangeTile(x, y));

        int guest = 4;
        System.out.println("Num of ways to invite guest are " + invite(guest));

        int size = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);
    }
}
