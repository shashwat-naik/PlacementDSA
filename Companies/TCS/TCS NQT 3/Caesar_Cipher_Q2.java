
import java.util.Scanner;

public class Caesar_Cipher_Q2 {
    public static String encryption(String text, int key) {
        if (key < 0)
            return "INVALID INPUT";
        StringBuilder encrypt = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                char shift = (char) (((ch - 'A' + key) % 26) + 'A');
                encrypt.append(shift);
            } else if (ch >= 'a' && ch <= 'z') {
                char shift = (char) (((ch - 'a' + key) % 26) + 'a');
                encrypt.append(shift);
            } else if (ch >= '0' && ch <= '9') {
                char shift = (char) (((ch - '0' + key) % 10) + '0');
                encrypt.append(shift);
            } else
                encrypt.append(ch);
        }
        return encrypt.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String text = sc.nextLine();
        System.out.print("Enter the key for skipping: ");
        int key = sc.nextInt();

        String result = encryption(text, key);
        System.out.println(result);
        sc.close();
    }
}
