
/* Q1- Consider the following series: 1, 1, 2, 3, 4, 7, 8, 15, 9, 24, 16, 40, 32, 72, 104, 27 ...
This series is a mixture of 3 series —
• All the prime position values are power of 2.
• All the perfect square position are power of 3.
• Remaining positions are sum of previous 2 values.
For example , if N-15, the 15th term in the series is 104, so only value 104 should be
printed to STDOUT.
You can assume that N will not exceed 40.
*/

import java.util.Scanner;

public class Q1 {
    public static boolean prime(int index) {
        if (index <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(index); i++) {
            if (index % i == 0)
                return false;
        }
        return true;
    }

    public static boolean PerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return (sqrt * sqrt == num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index: ");
        int index = sc.nextInt();

        int[] arr = new int[index + 1];

        arr[1] = 1;
        if (index > 1) {
            arr[2] = 1;
        }

        int power_2 = 2;
        int power_3 = 3;

        for (int i = 3; i <= index; i++) {
            if (prime(i)) {
                arr[i] = power_2;
                power_2 *= 2;
            } else if (PerfectSquare(i)) {
                arr[i] = power_3;
                power_3 *= 3;
            } else {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }
        System.out.println(arr[index]);
        sc.close();
    }
}
