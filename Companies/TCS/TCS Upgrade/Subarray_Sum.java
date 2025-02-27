import java.util.Scanner;

public class Subarray_Sum {
    public static void SubArr(int[] arr, int n, int s) {
        int currSum = arr[0], start = 0, i;
        for (i = 1; i < n; i++) {
            while (currSum > s && start < i - 1) {
                currSum -= arr[start];
                start++;
            }
            if (currSum == s) {
                System.out.print(start + 1 + " " + i);
                return;
            }
            currSum += arr[i];
        }
        System.out.println("-1");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {

            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] arr = new int[n];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }
            SubArr(arr, n, s);
        }
        sc.close();
    }
}