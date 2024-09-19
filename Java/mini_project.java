import java.util.Scanner;

public class mini_project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNum = (int) (Math.random() * 100);
        int userNum = 0;
        int count = 0;

        do {
            System.out.println("Guess a number: ");
            userNum = sc.nextInt();

            if (userNum == myNum) {
                System.out.println("You guessed it right ");
                break;
            } else if (userNum > myNum) {
                System.out.println("Guess lower");
                count++;
            } else {
                System.out.println("Guess it higher");
                count++;
            }
        } while (userNum >= 0);

        System.out.println("The number was " + myNum + "\n" + "You took " + (count + 1) + " steps to guess :)");
    }
}
