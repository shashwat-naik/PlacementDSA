import java.util.Scanner;

public class LastStudentID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.next();

        String largestSubString = "";

        for (int i = 0; i < s.length(); i++) {
            String currSubString = s.substring(i);
            if (currSubString.compareTo(largestSubString) > 0)
                largestSubString = currSubString;
        }
        System.out.println(largestSubString);
        sc.close();
    }
}
