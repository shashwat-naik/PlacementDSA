import java.util.ArrayList;
import java.util.List;

public class Swap_Kth_element {
    public static void swapKth(int k, List<Integer> arr) {
        int temp = arr.get(k - 1);
        int temp2 = arr.get(arr.size() - k);
        arr.set(k - 1, temp2);
        arr.set(arr.size() - k, temp);
    }

    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 2, 3, 4, 5);
        System.out.print("Before Swap: " + arr);

        List<Integer> newArr = new ArrayList<>(arr);
        int k = 2;
        swapKth(k, newArr);
        System.out.println("\nAfter Swap: " + newArr);
    }
}
