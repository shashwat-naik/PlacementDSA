import java.util.*;

public class MergeInterval {
    public static List<List<Integer>> merging(int[][] intervals) {
        if (intervals.length == 0) {
            return new ArrayList<>();
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> merged = new ArrayList<>();
        int[] currentInterval = intervals[0];
        merged.add(Arrays.asList(currentInterval[0], currentInterval[1]));

        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            int currentEnd = currentInterval[1];

            if (interval[0] <= currentEnd) {
                // Overlapping intervals, merge them
                currentInterval[1] = Math.max(currentEnd, interval[1]);
            } else {
                // Non-overlapping interval, add to the list
                currentInterval = interval;
                merged.add(Arrays.asList(currentInterval[0], currentInterval[1]));
            }
        }

        return merged;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 3 }, { 8, 10 }, { 2, 6 }, { 15, 18 } };
        List<List<Integer>> ans = merging(arr);
        System.out.print("The merged intervals are: \n");
        for (List<Integer> it : ans) {
            System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
        }
        System.out.println();
    }
}
