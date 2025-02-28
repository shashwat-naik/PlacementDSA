// Question is about calculating the minimum jumps over the clouds that are not prone to thunderstroke [0,0,1,0,0,0,1,0,1,0]

import java.util.Scanner;

public class Jumping_Cloud {
    public static int CloudJumping(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == 1)
                continue;
            if (i < n - 2 && arr[i + 2] == 0)
                i++;

            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(CloudJumping(arr, n));

        sc.close();
    }
}