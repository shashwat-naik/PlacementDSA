import java.util.Scanner;

public class PrepInsta_Q12 {
    public static int calculation(int c, int a, int b) {
        int ans=0;
        switch (c) {
            case 1:
                ans = a + b;
                break;
            case 2:
                ans = a - b;
                break;
            case 3:
                ans = a * b;
                break;
            case 4:
                ans = a / b;
                break;

            default:
                System.out.println("Operation not available");
                break;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
    int c = sc.nextInt ();
    int a = sc.nextInt ();
    int b = sc.nextInt ();

    System.out.println (calculation(c, a, b));
    sc.close();
    }
}
