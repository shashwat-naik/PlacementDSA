import java.util.Scanner;

public class Prepinsta_2 {
    public static boolean isUnique(int num) {
        boolean[] store = new boolean[10];
        while (num > 0) {
            int digit = num % 10;
            if (store[digit])
                return false;
            store[digit] = true;
            num /= 10;
        }
        return true;
    }

    public static int UniqueNum(int n1, int n2) {
        int count = 0;
        for (int i = n1; i <= n2; i++) {
            if (isUnique(i)) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter n2: ");
        int n2 = sc.nextInt();
        int result = UniqueNum(n1, n2);
        System.out.println("Output: " + result);

        sc.close();
    }
}
