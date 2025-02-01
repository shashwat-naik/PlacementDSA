/* Q-  Oddly Even Problem Statement
       Given a maximum of 100 digit numbers as input, find the difference between the sum of odd and even position digits
        Input: 4567
        Expected Output: 2
        Explanation : Odd positions are 4 and 6 as they are pos: 1 and pos: 3, both have sum 10. Similarly, 5 and 7 are at even positions pos: 2 and pos: 4 with sum 12. Thus, difference is 12 – 10 = 2
       */

import java.util.Scanner;

public class PrepInsta_Q2 {
    public static int arraySolve(int[] arr, int n) {
        int evenSum = 0, oddSum = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                evenSum += arr[i];
            else
                oddSum += arr[i];
        }
        return Math.abs(evenSum - oddSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.print("Enter elements of array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = arraySolve(arr, n);
        System.out.println("Difference between sums of odd and even positions: " + result);
        sc.close();
    }
}
