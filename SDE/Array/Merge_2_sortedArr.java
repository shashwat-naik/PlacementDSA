/* 
 * Brute Approach: Sorting the two arrays and storing them into another array. extra space
 * Optimal Approach 1: 2 pointer method
 * Optimal Approach 2: Gap sliding method
 */

public class Merge_2_sortedArr {
    public static void swapIfGreater(long[] arr1, long[] arr2, int ind1, int ind2) {
        if (arr1[ind1] > arr2[ind2]) {
            long temp = arr1[ind1];
            arr1[ind1] = arr2[ind2];
            arr2[ind2] = temp;
        }
    }

    public static void merge(long[] arr1, long[] arr2, int n, int m) {

        int len = n + m;
        int gap = (len / 2) + (len % 2);

        while (gap > 0) {

            int left = 0;
            int right = left + gap;
            while (right < len) {
                if (left < n && right >= n) {
                    swapIfGreater(arr1, arr2, left, right - n);
                } else if (left >= n) {
                    swapIfGreater(arr2, arr2, left - n, right - n);
                } else {
                    swapIfGreater(arr1, arr1, left, right);
                }
                left++;
                right++;
            }
            if (gap == 1)
                break;
            gap = (gap / 2) + (gap % 2);
        }
    }

    public static void main(String[] args) {
        long[] arr1 = { 1, 2, 3, 0,0,0 };
        long[] arr2 = { 2, 5, 3 };
        int n = 4, m = 3;
        merge(arr1, arr2, n, m);
        System.out.println("The merged arrays are:");
        System.out.print("arr1[] = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\narr2[] = ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        System.out.print("\nMerged array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}