
/* Q- Caesar Cipher substitution */
import java.util.Scanner;

public class PrepInsta_Q4a {
    public static String encryption(String text, int key) {
        if (key < 0)
            return "INVALID INPUT";
        StringBuilder encrypt = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                char shiftChar = (char) (((ch - 'A' + key) % 26) + 'A');
                encrypt.append(shiftChar);
            } else if (ch >= 'a' && ch <= 'z') {
                char shiftChar = (char) (((ch - 'a' + key) % 26) + 'a');
                encrypt.append(shiftChar);
            } else if (ch >= '0' && ch <= '9') {
                char shiftDigit = (char) (((ch - '0' + key) % 10) + '0');
                encrypt.append(shiftDigit);
            } else {
                encrypt.append(ch);
            }
        }
        return encrypt.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        System.out.print("Enter the key: ");
        int key = sc.nextInt();
        // int key=1;

        String result = encryption(input, key);

        System.out.println("Encrypted Text: " + result);
        sc.close();
    }
}
