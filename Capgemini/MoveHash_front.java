/* With this method of concatinating with 2 strings, i am getting time complexity as O(N^2) 
 * Whereas using it with Stringbuilder would solve the problem in O(N). 
*/

import java.util.Scanner;

public class MoveHash_front {
    public static void move(String s, int n) {
        // String s1 = new String("");
        // String s2 = new String("");
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '#')
                // s1 += s.charAt(i);
                s1.append(s.charAt(i));
            else
                // s2 += s.charAt(i);
                s2.append(s.charAt(i));
        }
        // String result = s1.concat(s2);
        String result = s1.toString().concat(s2.toString());
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        move(text, text.length());
    }
}
