public class Median_of_2sortedArr {
    public static double median(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        if (n1 > n2)
            return median(arr2, arr1);

        int low = 0, high = n1;
        int total = n1 + n2;
        int left = (total+ 1) / 2;

        while (low <= high) {
            int mid1 = low + (high - low) / 2;
            int mid2 = left - mid1;

            int l1 = (mid1 > 0) ? arr1[mid1 - 1] : Integer.MIN_VALUE;
            int l2 = (mid2 > 0) ? arr2[mid2 - 1] : Integer.MIN_VALUE;
            int r1 = (mid1 < n1) ? arr1[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2 < n2) ? arr2[mid2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                if (total % 2 == 1)
                    return Math.max(l1, l2);
                else
                    return ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
            } else if (l1 > l2)
                high = mid1 - 1;
            else
                low = mid1 + 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a = { 7, 12, 14, 15 };
        int[] b = { 1, 2, 3, 4, 9, 11 };
        System.out.println("The median of two sorted arrays is " + median(a, b));
    }
}
