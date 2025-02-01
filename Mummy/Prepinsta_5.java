import java.util.*;

public class Prepinsta_5 {
    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input forest dimensions
        int m = sc.nextInt();
        int n = sc.nextInt();

        // Input initial fire position
        int fireX = sc.nextInt() - 1; // Convert to 0-based indexing
        int fireY = sc.nextInt() - 1; // Convert to 0-based indexing

        // Input forest layout
        char[][] forest = new char[m][n];
        for (int i = 0; i < m; i++) {
            forest[i] = sc.next().toCharArray();
        }

        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(fireX, fireY));

        boolean[][] visited = new boolean[m][n];
        visited[fireX][fireY] = true;

        int minutes = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean fireSpread = false;

            for (int i = 0; i < size; i++) {
                Point current = queue.poll();

                for (int d = 0; d < 8; d++) {
                    int newX = current.x + dx[d];
                    int newY = current.y + dy[d];

                    if (newX >= 0 && newX < m && newY >= 0 && newY < n
                            && forest[newX][newY] == 'T' && !visited[newX][newY]) {
                        visited[newX][newY] = true;
                        queue.offer(new Point(newX, newY));
                        fireSpread = true;
                    }
                }
            }

            if (fireSpread) {
                minutes++;
            }
        }
        System.out.println(minutes);
        sc.close();
    }
}
