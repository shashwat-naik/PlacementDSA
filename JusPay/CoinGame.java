import java.util.Scanner;

public class CoinGame {
    public static int minStartBalance(int[] outcomes) {
        int currentBalance = 0;
        int minBalance = 0;

        for (int outcome : outcomes) {
            currentBalance += outcome;

            // If balance drops below zero, we track the lowest it goes
            if (currentBalance < 0) {
                minBalance = Math.min(minBalance, currentBalance);
            }
        }

        // If minBalance is negative, Raman needs at least that much money to start.
        // We take the absolute value of the negative balance + 1 to ensure it stays
        // non-negative.
        return Math.abs(minBalance) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of steps
        System.out.print("Enter number of steps: ");
        int n = sc.nextInt();

        int[] outcomes = new int[n];

        // Read the outcomes of each step
        System.out.println("Enter the outcomes: ");
        for (int i = 0; i < n; i++) {
            outcomes[i] = sc.nextInt();
        }

        // Calculate and print the minimum starting balance required
        System.out.println("Minimum starting balance: " + minStartBalance(outcomes));

        sc.close();
    }
}
