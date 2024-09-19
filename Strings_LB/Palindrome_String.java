import java.util.*;

public class Palindrome_String {
    public static int Palindrome(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to check for palindrome: ");
        String s = sc.next();

        int result = Palindrome(s);

        if (result == 1) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }

        sc.close();
    }
}
