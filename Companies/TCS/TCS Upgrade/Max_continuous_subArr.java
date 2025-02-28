
// Uses Kadanes Algorithm
import java.util.Scanner;

public class Max_continuous_subArr {
    public static void maxContsubArr(int[] arr, int n) {
        int currMax = arr[0], max = arr[0], start = 0, end = 0;

        for (int i = 1; i < n; i++) {
            currMax += arr[i];

            if (arr[i] > currMax) {
                currMax = arr[i];
                start = i + 1;
            }
            if (currMax > max) {
                max = currMax;
                end = i + 1;
            }
        }
        System.out.println("MAX is " + max + " from " + start + " to " + end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            maxContsubArr(arr, n);
        }
        sc.close();
    }
}
