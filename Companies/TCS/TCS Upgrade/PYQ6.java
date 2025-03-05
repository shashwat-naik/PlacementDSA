import java.util.Arrays;

public class PYQ6 {
    // Q1 Duplicate atleast 2 present in array
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        boolean ans = false;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1])
                ans = true;
        }
        System.out.println(ans);
    }

    // Q2 Longest common prefix in array

    public static String findCommonPrifix(String[] arr) {
        if (arr == null || arr.length == 0)
            return "";
        Arrays.sort(arr);

        String first = arr[0];
        String last = arr[arr.length - 1];
        int i = 0;
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        return first.substring(0, i);
    }

    public static void main(String[] args) {
        String[] arr = { "flower", "flow", "flight" };
        System.out.println("Longest Common Prefix: " + findCommonPrifix(arr));
    }
}
