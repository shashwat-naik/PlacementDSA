import java.util.*;

public class Find_all_duplicate {
    public List<Integer> DuplicateNum(int[] nums) {
        Set<Integer> traverse = new HashSet<>();
        List<Integer> duplicate = new ArrayList<>();

        for (int num : nums) {
            if (traverse.contains(num) && !duplicate.contains(num))
                duplicate.add(num);
            else
                traverse.add(num);
        }
        return duplicate;
    }

    public static void main(String[] args) {
        Find_all_duplicate sol = new Find_all_duplicate();
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(sol.DuplicateNum(nums));
    }
}
