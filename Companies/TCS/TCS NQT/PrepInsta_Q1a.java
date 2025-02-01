
import java.util.Scanner;

public class PrepInsta_Q1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total vehicles created: ");
        int V = sc.nextInt();
        System.out.print("Enter the total wheels: ");
        int W = sc.nextInt();

        if (W % 2 != 0 || W < 2 * V || W > 4 * V) // checking the number to be not divisible by 2 and is not between value 2*v and 4*v
            System.out.println("Invalid input");
        else {
            int FW = (W - 2 * V) / 2;
            int TW = V - FW;
            System.out.println("Two wheeler: " + TW + "\nFour wheeler: " + FW);
        }
        sc.close();
    }
}
