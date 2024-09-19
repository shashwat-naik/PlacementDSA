public class Pos_eleSortedInfiniteArr {
    public static int binarySearch(int[] arr, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int pos(int[] arr, int target) {
        int low = 0;
        int high = 1;

        // Expand the range exponentially until the target is less than or equal to arr[high]
        while (high < arr.length && arr[high] < target) {
            low = high;
            high = high * 2;

            // Ensure that high does not exceed the array length
            if (high >= arr.length) {
                high = arr.length - 1;
                break;
            }
        }

        // Perform binary search within the found range
        return binarySearch(arr, low, high, target);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
        int target = 170;

        // Function call
        int ans = pos(arr, target);
        if (ans == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + ans);
        }
    }
}
