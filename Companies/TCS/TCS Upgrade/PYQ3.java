import java.util.Scanner;

public class PYQ3 {
    // Q1 Remove brackets from the string
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     String input = sc.nextLine();
    //     String ans = "";

    //     for (char store : input.toCharArray()) {
    //         if (store == '(' || store == ')')
    //             continue;
    //         else
    //             ans += store;
    //     }
    //     System.out.println(ans);
    //     sc.close();
    // }

    // Q2 Multiply the digit
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int product = 1;

        while (num > 0) {
            int digit = num % 10;
            product *= digit;
            num /= 10;
        }

        System.out.println(product);
        sc.close();
    }
}