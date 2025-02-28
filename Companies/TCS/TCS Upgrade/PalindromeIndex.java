import java.util.Scanner;

public class PalindromeIndex {
    public static boolean check(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static int Palindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j && s.charAt(i) == s.charAt(j)) {
            i++;
            j--;
        }

        if (i < j) {
            if (check(s.substring(i + 1, j + 1))) {
                return i;
            } else if (check(s.substring(i, j))) {
                return j;
            } else {
                return -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int result = Palindrome(s);
        System.out.println("Remove the character at index " + result);

        sc.close();
    }
}
