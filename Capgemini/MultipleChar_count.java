/* Below is the brute force approach for traversing through the  */

import java.util.Scanner;

public class MultipleChar_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        int count, skip = 0;

        for (int i = 0; i < str.length(); i += skip) {
            count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            skip = count;
            System.out.print(str.charAt(i));
            System.out.print(count);
        }
    }
}

// .........................................................................................

/* 
import java.util.Scanner;

public class MultipleChar_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result.append(str.charAt(i - 1));
                if (count > 1) {
                    result.append(count);
                }
                count = 1;
            }
        }

        System.out.println(result.toString());
    }
}
 */
