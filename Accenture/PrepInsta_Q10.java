import java.util.Scanner;

public class PrepInsta_Q10 {
    public static int Carries(int num1, int num2) {
        int count = 0;
        int temp1 = num1, temp2 = num2;
        int rem = 0;

        while (temp1 != 0 && temp2 != 0) {
            int d1 = temp1 % 10, d2 = temp2 % 10;
            if ((d1 + d2 + rem) > 9) {
                count++;
                int sum = d1 + d2 + rem;
                sum = sum / 10;
                rem = sum;
            }
            temp1 /= 10;
            temp2 /= 10;
        }
        while (temp1 != 0) {
            int d1 = temp1 % 10;
            if ((d1 + rem) > 9) {
                count++;
                int sum = d1 + rem;
                sum /= 10;
                rem = sum;
            }
            temp1 /= 10;
        }
        while (temp2 != 0) {
            int d2 = temp2 % 10;
            if ((d2 + rem) > 9) {
                count++;
                int sum = d2 + rem;
                sum /= 10;
                rem = sum;
            }
            temp2 /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two digits:- ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(Carries(num1, num2));

        sc.close();
    }
}
