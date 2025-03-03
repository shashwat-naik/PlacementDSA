
import java.util.Scanner;

public class Picking_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = 0, max = 0;

        int[] arr = new int[100];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
            arr[k]++;
        }
        for (int i = 0; i < num - 1; i++) {
            if (arr[i] + arr[i + 1] > max) {
                max = arr[i] + arr[i + 1];
            }
        }
        System.out.println(max);

        sc.close();
    }
}
