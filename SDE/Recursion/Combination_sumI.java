import java.util.ArrayList;
import java.util.List;

public class Combination_sumI {
    private void Combination(int idx, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (idx == arr.length) {
            if (target == 0)
                ans.add(new ArrayList<>(ds));
            return;
        }

        if (arr[idx] <= target) {
            ds.add(arr[idx]);
            Combination(idx, arr, target - arr[idx], ans, ds);
            ds.remove(ds.size() - 1);
        }
        Combination(idx + 1, arr, target, ans, ds);
    }

    public List<List<Integer>> Sum(int[] element, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Combination(0, element, target, ans, new ArrayList<>());
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 6, 7 };
        int target = 7;
        Combination_sumI sol = new Combination_sumI();
        List<List<Integer>> ls = sol.Sum(arr, target);
        System.out.println("Combinations are: ");
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 0; j < ls.get(i).size(); j++) {
                System.out.print(ls.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
