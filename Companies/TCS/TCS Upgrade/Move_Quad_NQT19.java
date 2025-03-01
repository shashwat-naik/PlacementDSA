import java.util.Scanner;

public class Move_Quad_NQT19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int x = 0, y = 0, count, move, d;
        for (count = 0, move = 0, d = 10; count < n; count++, move++, d = d + 10, move = move % 4) {
            switch (move) {
                case 0:
                    x = x + d;
                    break;
                case 1:
                    y = y + d;
                    break;
                case 2:
                    x = x - d;
                    break;
                case 3:
                    y = y - d;
                    break;
            }
        }
        System.out.println(x + " " + y);
    }
}
