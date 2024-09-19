import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> triplet(int n, int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            // ignore duplicates
            if (i != 0 && arr[i] == arr[i - 1])
                continue;

            int start = i + 1;
            int end = n - 1;
            while (start < end) {
                int sum = arr[i] + arr[start] + arr[end];
                if (sum < 0)
                    start++;
                else if (sum > 0)
                    end--;
                else {
                    List<Integer> temp = Arrays.asList(arr[i], arr[start], arr[end]);
                    ans.add(temp);
                    start++;
                    end--;

                    // skipping the duplicates
                    while (start < end && arr[start] == arr[start - 1])
                        start++;
                    while (start < end && arr[end] == arr[end + 1])
                        end--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        int n = arr.length;
        List<List<Integer>> ans = triplet(n, arr);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}
