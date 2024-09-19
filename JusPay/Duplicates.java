import java.util.HashSet;
import java.util.Scanner;

public class Duplicates {
    public static int removeDup(int[] mail, int n) {
        HashSet<Integer> check = new HashSet<>();
        int duplicate = 0;

        for (int i = 0; i < n; i++) {
            if (check.contains(mail[i]))
                duplicate++;
            else
                check.add(mail[i]);
        }
        return duplicate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total mails received: ");
        int mail = sc.nextInt();

        int[] input = new int[mail];
        System.out.print("Email id: ");
        for (int i = 0; i < mail; i++) {
            input[i] = sc.nextInt();
        }

        int duplicates = removeDup(input, mail);
        System.out.print("Duplicate email IDs: " + duplicates);
        sc.close();
    }
}
