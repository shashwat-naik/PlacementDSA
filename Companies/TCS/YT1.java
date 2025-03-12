import java.util.*;

public class YT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Q1 For printing each element with frequency
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // Q2 For printing the element with maximum frequency
        for (int x : map.keySet()) {
            if (map.get(x) > n / 2) {
                System.out.println(x);
                return;
            }
        }
        System.out.println(-1);
        sc.close();
    }
}