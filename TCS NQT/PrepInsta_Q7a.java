import java.util.Scanner;

public class PrepInsta_Q7a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total monkeys: ");
        int n = sc.nextInt();
        System.out.print("No of Bananas eaten by a monkey: ");
        int k = sc.nextInt();
        System.out.print("No of Peanuts eaten by a monkey: ");
        int j = sc.nextInt();
        System.out.print("Total Bananas: ");
        int m = sc.nextInt();
        System.out.print("Total Peanuts: ");
        int p = sc.nextInt();

        if (n < 0 || k <= 0 || j <= 0 || m < 0 || p < 0) {
            System.out.println("Invalid Input");
        } else {
            int bananaConsume = m / k;
            int peanutConsume = p / j;
            n = n - (bananaConsume + peanutConsume);

            if (m % k > 0 || p % j > 0) {
                n--;
            }

            if (n < 0) {
                n = 0;
            }

            System.out.println("Monkeys on tree: " + n);
        }
        sc.close();
    }
}
