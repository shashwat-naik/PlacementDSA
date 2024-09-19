// Q- From the array with signs, rearrange the values.
/* Brute Approach: Sorting normally will give you time complexity of O(nlogn) || Using quicksort will give time complexity of O(n)
 * Optimal approach: Using Dutch flag algorithm O(n)
*/
public class Rearrange_arr_eleBySign {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void arrange(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            if (arr[low] <= 0) {
                low++;
            } else {
                swap(arr, low, high);
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, -4, -5, 2, -7, 3, 2, -6, -8, -9, 3, 2, 1 };
        arrange(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
