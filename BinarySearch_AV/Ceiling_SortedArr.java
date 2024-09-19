public class Ceiling_SortedArr {
    public static int ceilingVal(int[] arr, int start, int end, int key) {
        int result = -1;
        if (key == 0)
            return -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key)
                return mid;

            else if (arr[mid] < key)
                start = mid + 1;

            else {
                result = mid;
                end = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 8, 10, 10, 12, 19 };
        int x = 5;
        int n = arr.length;

        int index = ceilingVal(arr, 0, n - 1, x);
        if (index == -1)
            System.out.println("Ceiling of " + x + " doesn't exist in array");
        else
            System.out.println("ceiling of " + x + " is " + arr[index]);
    }
}
