public class Index_first1_sortedInfiniteArr {
    public static int BinarySearch(int[] arr, int low, int high) {
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == 1) {
                result = mid;
                high = mid - 1;
            } else if (arr[mid] < 1) {
                low = mid + 1;
            }
        }
        return result;
    }

    public static int pos(int[] arr) {
        int low = 0;
        int high = 1;

        if (arr[low] == 1) {
            return low;
        }
        while (high < arr.length && arr[high] == 0) {
            low = high;
            high = high * 2;
            
            if (high >= arr.length) {
                high = arr.length - 1;
                break;
            }
        }
        return BinarySearch(arr, low, high);
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 0, 0, 0, 0, 0 };
        int index = pos(arr);

        if (index != -1) {
            System.out.println("Index of first occurrence of 1 is: " + index);
        } else {
            System.out.println("1 is not present in the array.");
        }
    }
}
