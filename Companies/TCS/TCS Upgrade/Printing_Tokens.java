import java.util.Scanner;

public class Printing_Tokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] tokens = input.split(" ");

        for (String token : tokens) {
            System.out.println(token);
        }
        sc.close();
    }
}
