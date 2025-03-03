import java.util.Scanner;

public class NumberLineJump_Circus {
    public static String numLineJump(int x1, int v1, int x2, int v2) {
        if (v1 > v2 && (x2 - x1) % (v1 - v2) == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), v1 = sc.nextInt(), x2 = sc.nextInt(), v2 = sc.nextInt();

        System.out.println(numLineJump(x1, v1, x2, v2));
        sc.close();
    }
}
