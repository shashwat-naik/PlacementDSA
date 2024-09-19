// Approach: Sort the string first by converting it into character array and then count its permutation

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationString {
    public static String sorting(String str) {
        char temp[] = str.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }

    public static void permutation(String str, String permute, ArrayList<String> arr) {
        if (str.length() == 0) {
            if (!arr.contains(permute)) {
                arr.add(permute);
            }
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            permutation(newStr, permute + curr, arr);
        }
    }

    public static List<String> findPermutation(String s) {
        ArrayList<String> arr = new ArrayList<>();
        s=sorting(s);
        permutation(s, "", arr);
        return arr;
    }

    public static void main(String[] args) {
        String sample = "ABC";
        List<String> permutations = findPermutation(sample);

        System.out.println("All possible permutations of the string " + sample + " are:");
        for (String perm : permutations) {
            System.out.print(perm + " ");
        }
    }
}
