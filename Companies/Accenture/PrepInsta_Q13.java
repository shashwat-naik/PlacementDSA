import java.util.Scanner;

public class PrepInsta_Q13 {
    // used for calculating power of 2 possible
    public static int count(int i) {
        int num = 0;
        while (i % 2 == 0 && i != 0) {
            num++;
            i = i / 2;
        }
        return num;
    }

    public static int maxExp(int a, int b) {
        int max = 0, num = 0;
        for (int i = a; i <= b; i++) {
            int temp = count(i);
            if (temp > max) {
                max = temp;
                num = i;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(maxExp(a, b));

        sc.close();
    }
}
