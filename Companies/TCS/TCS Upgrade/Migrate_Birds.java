import java.util.HashMap;
import java.util.Scanner;

public class Migrate_Birds {
    public static int mostFrequentBird(int[] arr) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int mostFrequent = 0, maxFrequency = 0;

        for (int num : arr) {
            int freq = count.getOrDefault(num, 0) + 1;
            count.put(num, freq);

            if (freq > maxFrequency || (freq == maxFrequency && num < mostFrequent)) {
                mostFrequent = num;
                maxFrequency = freq;
            }
        }
        return mostFrequent;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(mostFrequentBird(arr));

        sc.close();
    }
}
