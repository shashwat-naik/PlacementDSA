import java.util.Scanner;

public class trial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            data[i] = sc.nextInt();
        }
        System.out.println("Output: ");
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
