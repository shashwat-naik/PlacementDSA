import java.util.Scanner;
import java.util.Arrays;

public class CopyCat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word by the student 1 and copy student: ");
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        char[] one = word1.toCharArray();
        Arrays.sort(one);
        char[] two = word2.toCharArray();
        Arrays.sort(two);

        String result1 = new String(one);
        String result2 = new String(two);

        if (result1.equals(result2))
            System.out.println("Copied word");
        else
            System.out.println("Not Copied");

        sc.close();
    }
}
