import java.util.Scanner;

public class PrepInsta_Q14 {
    public static int calculate(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of m and n");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int result = calculate(m, n);
        System.out.println(result);

        sc.close();
    }
}
