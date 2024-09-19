public class MinDiff_Ele_SortArr {
    public static int BinarySearchMinDiff(int[] arr, int target) {
        int n = arr.length;

        if (target < arr[0])
            return arr[0];
        if (target > arr[n - 1])
            return arr[n - 1];

        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target == arr[mid])
                return arr[mid];
            else if (target < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        if ((arr[low] - target) < (target - arr[high]))
            return arr[low];

        return arr[high];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 8, 10, 15 };
        int target = 12;
        int result = BinarySearchMinDiff(arr, target);
        System.out.println("The element with the minimum difference to " + target + " is " + result);
    }
}
