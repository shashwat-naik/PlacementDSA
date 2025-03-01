import java.util.Scanner;

public class Equilibrium_Point {
    public static int Equilibrium(int[] arr, int n) {
        int sum = 0, leftSum = 0;

        for (int i = 0; i < n; i++)
            sum += arr[i];
        for (int j = 0; j < n; j++) {
            sum -= arr[j];
            if (leftSum == sum)
                return (j + 1);
            leftSum += arr[j];
        }
        return -1;
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
            System.out.println(Equilibrium(arr, n) + " is the Equilibrium position.");
        }
        sc.close();
    }
}