import java.util.*;

public class SubsetSum {
    public static void SubsetHelper(int idx, int sum, ArrayList<Integer> arr, int N, ArrayList<Integer> sumSubset) {

        if (idx == N) {
            sumSubset.add(sum);
            return;
        }
        // added part
        SubsetHelper(idx + 1, sum + arr.get(idx), arr, N, sumSubset);
        // not added
        SubsetHelper(idx + 1, sum, arr, N, sumSubset);
    }

    static ArrayList<Integer> subsetSum(ArrayList<Integer> arr, int N) {
        ArrayList<Integer> sumSubset = new ArrayList<>();
        SubsetHelper(0, 0, arr, N, sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        ArrayList<Integer> ans = subsetSum(arr, arr.size());
        Collections.sort(ans);
        System.out.println("The sum of each subset is ");
        for (int i = 0; i < ans.size(); i++)
            System.out.print(ans.get(i) + " ");
    }
}
