import java.util.*;

public class SpecialSumArr {
    public static int specialSum(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
            if (sum >= 10) {
                sum = sum % 10;
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 9, 4, 6, 2, 8, 2, 0, 1));

        int result = specialSum(arr, arr.size());
        System.out.println(result);
    }
}
