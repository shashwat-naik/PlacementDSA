import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_sumII {
    public static void Combination(int idx, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            if (i > idx && arr[i] == arr[i - 1])
                continue;
            if (arr[i] > target)
                break;

            ds.add(arr[i]);
            Combination(i + 1, arr, target - arr[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
    }

    public static List<List<Integer>> Sum(int[] element, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(element);
        Combination(0, element, target, ans, new ArrayList<>());
        return ans;
    }

    public static void main(String args[]) {
        int v[] = { 10, 1, 2, 7, 6, 1, 5 };
        List<List<Integer>> comb = Sum(v, 8);
        System.out.println(comb.toString().replace(",", " "));
    }
}
