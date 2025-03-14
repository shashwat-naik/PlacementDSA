
import java.util.*;

public class YT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
        int n = arr.length-1;
        Arrays.sort(arr);
        System.out.println(n - k);
        sc.close();
    }
}