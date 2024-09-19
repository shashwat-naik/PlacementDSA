public class Floor_SortedArr {
    public static int floorVal(int[] arr, int low, int high, int target) {
        if (low >= high)
            return -1;

        if (target >= arr[high])
            return high;

        int mid = low + (high - low) / 2;

        if (arr[mid] == target)
            return mid;
        if (mid > 0 && arr[mid - 1] <= target && target < arr[mid])
            return mid - 1;
        if (target < arr[mid])
            return floorVal(arr, low, mid - 1, target);

        return floorVal(arr, mid + 1, high, target);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 6, 10, 12, 14 };
        int n = arr.length;
        int x = 7;

        int index = floorVal(arr, 0, n - 1, x);

        if (index == -1)
            System.out.print("Floor of " + x + " doesn't exist in array ");
        else
            System.out.print("Floor of " + x + " is " + arr[index]);
    }
}
