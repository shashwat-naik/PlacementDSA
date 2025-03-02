// Sexy Prime are the number whose diffrence is 6.

import java.util.Scanner;

public class SexyPrime_NQT21 {
    public static boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();

        int count = 0;

        for (int i = left; i + 6 <= right; i++) {
            if (isPrime(i) && isPrime(i + 6)) {
                System.out.println(i + " " + (i + 6));
                count++;
            }
        }
        System.out.println("Total Sexy Prime are: " + count);
        sc.close();
    }
}
