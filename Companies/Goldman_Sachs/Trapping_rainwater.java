/* Q- Trapping of rain water within the buildings through variations of their height
 * Used 2 pointer technique with prefixmax and suffix max method
 */

public class Trapping_rainwater {
    public static int trap(int[] arr) {
        int left = 0, right = arr.length - 1;
        int Lmax = 0, Rmax = 0, total = 0;
        while (left < right) {
            if (arr[left] < arr[right]) {
                if (Lmax > arr[left])
                    total += Lmax - arr[left];
                else
                    Lmax = arr[left];
                left++;
            } else {
                if (arr[right] < Rmax)
                    total += Rmax - arr[right];
                else
                    Rmax = arr[right];
                right--;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trap(height));
    }
}