import java.util.Scanner;

public class MinMax_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Sum calc
        long sum = 0, max, min;
        max = min = arr[0];
        sum += arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
            if (min > arr[i])
                min = arr[i];
            sum += arr[i];

        }
        System.out.println("Max sum: " + (sum - min) + "\nMin sum: " + (sum - max));
        sc.close();
    }
}