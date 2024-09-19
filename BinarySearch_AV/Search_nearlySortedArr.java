public class Search_nearlySortedArr {
    public static int binarySearch(int[] arr, int start, int end, int target) {
        if (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;
            if (mid > start && arr[mid - 1] == target)
                return (mid - 1);
            if (mid < end && arr[mid + 1] == target)
                return (mid + 1);

            if (arr[mid] > target)
                return binarySearch(arr, start, mid - 2, target);

            return binarySearch(arr, mid + 2, end, target);
        }
        return -1;
    }
    public static void main(String[] args) {
        
    }
}
