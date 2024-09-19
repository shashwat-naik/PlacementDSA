public class Search_BitonicArr {
    public static int ascBinarySearch(int[] arr, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static int desBinarySearch(int[] arr, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static int findingBitonicEle(int[] arr, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid > 0 && mid < arr.length - 1) {
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
                    return mid;
                else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1])
                    low = mid + 1;
                else
                    high = mid - 1;

            } else if (mid == 0) {
                if (arr[0] > arr[1])
                    return 0;
                else
                    return 1;

            } else if (mid == arr.length - 1) {
                if (arr[arr.length - 1] > arr[arr.length - 2])
                    return arr.length - 1;
                else
                    return arr.length - 2;
            }
        }
        return -1;
    }

    public static int searchEle(int[] arr, int size, int target, int index) {
        if (target == arr[index])
            return index;

        int temp = ascBinarySearch(arr, 0, index - 1, target);
        if (temp != -1)
            return temp;

        return desBinarySearch(arr, index + 1, size - 1, target);
    }

    public static void main(String[] args) {
        int arr[] = { -8, 1, 2, 3, 4, 5, -2, -3 };
        int key = 5;

        int index = findingBitonicEle(arr, 0, arr.length - 1);

        int result = searchEle(arr, arr.length, key, index);

        if (result == -1)
            System.out.println("Element Not Found");
        else
            System.out.println("Element Found at index " + result);
    }
}
