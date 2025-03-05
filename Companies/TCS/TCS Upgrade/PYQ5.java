import java.util.Scanner;

public class PYQ5 {
    // Q1 Find the maximum number of times 1 appears contiguously
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int[] arr = new int[n];
    // for (int i = 0; i < n; i++) {
    // arr[i] = sc.nextInt();
    // }
    // int maximum = 0, count = 0;
    // for (int i = 0; i < n; i++) {
    // if (arr[i] == 1) {
    // count++;
    // maximum = Math.max(maximum, count);
    // } else
    // count = 0;
    // }
    // System.out.println("Max no. of times cont. 1 appears : " + maximum);
    // sc.close();

    // }

    // Q2 Check array is subset of another array
    public static boolean isSubset(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        if (m > n)
            return false;
        for (int i = 0; i < m; i++) {
            boolean present = false;
            for (int j = 0; j < n; j++) {
                if (arr2[j] == arr1[i]) {
                    present = true;
                    break;
                }
            }
            if (present == false)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 4, 5, 2 };
        int[] arr2 = { 11, 12, 13, 15, 16 };

        boolean ans = isSubset(arr1, arr2);
        if (ans)
            System.out.println("arr1[] is a subset of arr2[]");
        else
            System.out.println("arr1[] is not a subset of arr2[]");
    }
}
