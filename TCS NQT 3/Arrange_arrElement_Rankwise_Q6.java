import java.util.Arrays;
import java.util.HashMap;

public class Arrange_arrElement_Rankwise_Q6 {
    public static void main(String[] args) {
        int[] arr = { 20, 15, 26, 2, 98, 6 };
        int[] sortArr = arr.clone();
        Arrays.sort(sortArr);

        HashMap<Integer, Integer> mapping = new HashMap<>();
        int rank = 1;
        for (int i = 0; i < sortArr.length; i++) {
            if (!mapping.containsKey(sortArr[i])) {
                mapping.put(sortArr[i], rank);
                rank++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = mapping.get(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
