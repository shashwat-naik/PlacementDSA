import java.util.Scanner;

public class PrepInsta_Q2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string * or #: ");
        String s = sc.nextLine();
        int count1 = 0, count2 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*')
                count1++;
            else if (s.charAt(i) == '#')
                count2++;
        }
        System.out.println(count1 - count2);

        sc.close();
    }
}
