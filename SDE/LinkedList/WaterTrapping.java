import java.util.*;

public class WaterTrapping {
    static int trap(int[] height) {
        int n = height.length;
        int right = n - 1, left = 0;
        int result = 0;
        int maxLeft = 0, maxRight = 0;

        while (left <= right) {
            if (height[left] < height[right]) {
                if (height[left] >= maxLeft)
                    maxLeft = height[left];
                else
                    result += maxLeft - height[left];
                left++;
            } else {
                if (height[right] >= maxRight)
                    maxRight = height[right];
                else
                    result += maxRight - height[right];
                right--;
            }
        }
        return result;
    }

    public static void main(String args[]) {
        int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println("Amount of water trapped is " + trap(arr));
    }
}
