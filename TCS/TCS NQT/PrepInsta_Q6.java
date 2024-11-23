import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrepInsta_Q6 {
    public static void rotate(List<Integer> arr, int n) {
        int lastEle = arr.get(n - 1);
        for (int i = n - 1; i > 0; i--) {
            arr.set(i, arr.get(i - 1));
        }
        arr.set(0, lastEle);
    }

    public static List<Integer> rightCircularRotation(List<Integer> arr, int k, List<Integer> indices) {
        int n = arr.size();

        for (int i = 0; i < k; i++)
            rotate(arr, n);

        List<Integer> result = new ArrayList<>();
        for (int index : indices)
            result.add(arr.get(index));
        return result;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        int k = 3;
        List<Integer> indices = Arrays.asList(0, 2);

        List<Integer> result = rightCircularRotation(arr, k, indices);
        System.out.println("Rotated array: " + arr);
        System.out.println("Elements at specified indices: " + result);

    }
}
