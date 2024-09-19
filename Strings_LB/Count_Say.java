// In java if we use string in this question, it being immutable, will affect the time complexity as it will create new reference every time so instead use string builder

import java.util.Scanner;

public class Count_Say {
    public static String count(int n) {
        if (n == 1)
            return "1";

        String s = count(n - 1);
        StringBuilder result = new StringBuilder();

        int counter = 1;

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                counter++;
            } else {
                result.append(counter).append(s.charAt(i - 1));
                counter = 1;
            }
        }
        result.append(counter).append(s.charAt(s.length() - 1));

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for n: ");
        int n = sc.nextInt();

        String ans = count(n);
        System.out.println(n + "th term : " + ans);
        sc.close();
    }
}
