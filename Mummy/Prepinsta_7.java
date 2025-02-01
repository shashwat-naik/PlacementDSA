import java.util.Arrays;
import java.util.Scanner;

public class Prepinsta_7 {
    private static int cntArrangement(int[] grp, int index, boolean[] visited, int n, int r) {
        if (index == r) {
            return 1; // One valid arrangement found
        }

        int count = 0;

        // Backtracking to assign members to the current group
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true; // Mark as visited
                int members = 1; // Start with the current attendee

                // Assign more members to the current group
                for (int j = i + 1; j < n && members < grp[index]; j++) {
                    if (!visited[j]) {
                        visited[j] = true;
                        members++;
                    }
                }

                // Check if the group is complete
                if (members == grp[index]) {
                    count += cntArrangement(grp, index + 1, visited, n, r);
                }

                // Backtrack: Unmark only the members added in this step
                for (int j = i; j < n && members > 0; j++) {
                    if (visited[j]) {
                        visited[j] = false;
                        members--;
                    }
                }
            }
        }
        return count;
    }

    public static int uniqueSeatArrange(int r, int n) {
        if (r == 0 || n == 0 || r > n) {
            return 0; // Invalid input cases
        }

        // Determine group sizes
        int baseSize = n / r;
        int remainder = n % r;

        int[] grp = new int[r];
        Arrays.fill(grp, baseSize);
        for (int i = 0; i < remainder; i++) {
            grp[i]++;
        }

        // Backtracking to count unique arrangements
        boolean[] visited = new boolean[n];
        return cntArrangement(grp, 0, visited, n, r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        while (testcase-- > 0) {
            int r = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(uniqueSeatArrange(r, n));
        }
        sc.close();
    }
}
