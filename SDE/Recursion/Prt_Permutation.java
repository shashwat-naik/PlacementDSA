import java.util.ArrayList;
import java.util.List;

public class Prt_Permutation {
    public void recurPermute(int index, int[] arr, List<List<Integer>> res) {
        if (index == arr.length) {
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                ds.add(arr[i]);
            }
            res.add(new ArrayList<>(ds));
            return;
        }
        for (int i = index; i < arr.length; i++) {
            swap(i, index, arr);
            recurPermute(index + 1, arr, res);
            swap(i, index, arr);
        }
    }

    public static void swap(int i, int j, int[] arr) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        recurPermute(0, arr, ans);
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3 };
        Prt_Permutation sol = new Prt_Permutation();
        List<List<Integer>> ls = sol.permute(nums);
        System.out.println("All Permutations are");
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 0; j < ls.get(i).size(); j++) {
                System.out.print(ls.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
