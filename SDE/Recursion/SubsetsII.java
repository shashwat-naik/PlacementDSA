import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SubsetsII {
    static void printAns(List < String > ans) {
        System.out.println("The unique subsets are ");
        System.out.println(ans.toString().replace(",", " "));
    }
    public static void findSubset(int[] nums, int index, List < Integer > ds, HashSet < String > res) {
        if (index == nums.length) {
            Collections.sort(ds);
            res.add(ds.toString());
            return;
        }
        ds.add(nums[index]);
        findSubset(nums, index + 1, ds, res);
        ds.remove(ds.size() - 1);
        findSubset(nums, index + 1, ds, res);
    }
    public static List < String > subsetsWithDup(int[] nums) {
        List < String > ans = new ArrayList < > ();
        HashSet < String > res = new HashSet < > ();
        List < Integer > ds = new ArrayList < > ();

        findSubset(nums, 0, ds, res);
        
        for (String it: res) {
            ans.add(it);
        }
        return ans;
    }

    public static void main(String args[]) {
        int nums[]={1,2,2};
        List < String > ans = subsetsWithDup(nums);
        printAns(ans);

    }
}
