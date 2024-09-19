import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        long n = sc.nextLong();
        long reverse = 0;

        while (n != 0) {
            long temp = n % 10;
            reverse = reverse * 10 + temp;
            n /= 10;
        }
        System.out.println("Reversed: " + reverse);
        sc.close();
    }
}
