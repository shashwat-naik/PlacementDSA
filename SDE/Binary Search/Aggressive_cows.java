import java.util.Arrays;

public class Aggressive_cows {
    public static boolean Cowplacement(int[] stall, int distance, int cow) {
        int n = stall.length;
        int cowCount = 1;
        int last = stall[0];

        for (int i = 0; i < n; i++) {
            if (stall[i] - last >= distance) {
                cowCount++;
                last = stall[i];
            }
            if (cowCount >= cow) 
                return true;
        }
        return false;
    }

    public static int angryCow(int[] stall, int k) {
        int n = stall.length;
        Arrays.sort(stall);

        int low = 1, high = stall[n - 1] - stall[0];
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (Cowplacement(stall, mid, k) == true)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return high;
    }

    public static void main(String[] args) {
        int[] stalls = { 0, 3, 4, 7, 10, 9 };
        int k = 4;
        int ans = angryCow(stalls, k);
        System.out.println("The maximum possible minimum distance is: " + ans);
    }
}
