/* Brute Approach: Sorting O(nlogn) // here used this method
 * Optimal Approach: Hash map O(n)
 */

import java.util.Arrays;
import java.util.Scanner;

public class PrintDuplicates {
    public static void Duplicates(String str) {
        int n = str.length();
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        String sorted = new String(ch);

        for (int i = 0; i < n; i++) {
            int count = 1;

            while (i < n - 1 && sorted.charAt(i) == sorted.charAt(i+1)) {
                count++;
                i++;
            }

            if (count > 1) {
                System.out.println(sorted.charAt(i) + ", count= " + count);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to know the duplicates: ");
        String str = sc.next();

        Duplicates(str);
        sc.close();
    }
}

/* Logic
 * Took the String and converted it into char array and sorting the array. Then comparing the i & i+1 element from the array. If the count increases then the arr elements is displayed along with the occurence.
 */