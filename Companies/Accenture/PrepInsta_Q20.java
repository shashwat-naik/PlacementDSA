import java.util.HashSet;
import java.util.Set;

public class PrepInsta_Q20 {
    public static int FindAutoCount(String n) {
        int[] count = new int[10]; 
        int length = n.length();

        // Counting occurrences of each digit in the string
        for (int i = 0; i < length; i++) {
            int digit = n.charAt(i) - '0';
            if (digit < 10) {
                count[digit]++;
            }
        }

        // Checking if the count matches the corresponding digit
        for (int i = 0; i < length; i++) {
            int digit = n.charAt(i) - '0';
            if (count[i] != digit) {
                return 0; // Not an autobiographical number
            }
        }

        // Calculate distinct digits count
        Set<Integer> distinctDigits = new HashSet<>();
        for (int i = 0; i < length; i++) {
            distinctDigits.add(n.charAt(i) - '0');
        }

        return distinctDigits.size(); // Return the count of distinct digits
    }

    public static void main(String[] args) {
        // Test cases
        String test1 = "1210"; // Autobiographical number
        String test2 = "2020"; // Not an autobiographical number

        System.out.println("The result for " + test1 + " is: " + FindAutoCount(test1));
        System.out.println("The result for " + test2 + " is: " + FindAutoCount(test2));
    }
}
