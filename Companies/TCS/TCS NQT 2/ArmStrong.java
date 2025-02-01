import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int input = sc.nextInt();

        int original = input;
        int sum = 0;
        while (input > 0) {
            int temp = input % 10;
            sum += temp * temp * temp;
            input = input / 10;
        }

        if (sum == original)
            System.out.println("Armstrong number");
        else
            System.out.println("Not Armstrong number");
        sc.close();
    }
}
