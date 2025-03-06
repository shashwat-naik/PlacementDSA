import java.util.Arrays;
import java.util.Scanner;

public class PYQ10 {

    // Q1*** Check if two strings are equal or not

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int count0 = 0, count1 = 0, count_0 = 0, count_1 = 0;
        int i = 0, j = 0;

        while (i < s1.length() || j < s2.length()) {
            if (i < s1.length()) {
                if (s1.charAt(i) == '0')
                    count0++;
                else if (s1.charAt(i) == '1')
                    count1++;
                else {
                    System.out.println("Invalid Input");
                    return;
                }
            }
            if (j < s2.length()) {
                if (s2.charAt(j) == '0')
                    count_0++;
                else if (s2.charAt(j) == '1')
                    count_1++;
                else {
                    System.out.println("Invalid Input");
                    return;
                }
            }
            i++;
            j++;
        }

        if (count0 == count_0 && count1 == count_1)
            System.out.println("Yes");
        else
            System.out.println("No");

        sc.close();
    }

    // Q2 Number is prime or not
    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            num = sc.nextInt();

            if (num == 0) {
                System.out.println("Program Stopped.");
                break;
            }

            if (isPrime(num)) {
                System.out.println(num + " is a Prime Number.");
                break;
            } else {
                System.out.println(num + " is not a Prime Number. Try again.");
            }
        }
        sc.close();
    }

    // Q3 Arithmetic Progression int the array

    public static boolean AP(int[] arr) {
        Arrays.sort(arr);
        int d = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != d)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = { 3, 6, 9, 12 }; // AP
        int[] arr2 = { 2, 5, 9, 14 }; // Not AP

        System.out.println(AP(arr2) ? "Yes, it's an AP" : "No, it's not an AP");
    }
}
