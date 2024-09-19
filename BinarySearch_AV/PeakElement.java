public class PeakElement {
    public static int findPeak(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[mid + 1])
                high = mid;
            else
                low = mid + 1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peakIndex = findPeak(arr);
        System.out.println("The peak element is at index: " + peakIndex);
        System.out.println("The peak element is: " + arr[peakIndex]);
    }
}
