// Union Part
/* import java.util.ArrayList;
import java.util.List;

public class Union_Intersection_ofArr {
    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 1, 3, 3, 2, 2 };
        int[] arr2 = { 3, 3, 3, 4 };

        int left = 0, right = 0;
        List<Integer> result = new ArrayList<>();

        while (left < arr1.length || right < arr2.length) {
            // Skip interation
            while (left > 0 && left < arr1.length && arr1[left] == arr1[left - 1]) {  // left pointer is greater than first element,its lesser than the array size & equal to just-previous element
                left++;
            }
            while (right > 0 && right < arr2.length && arr2[right] == arr2[right - 1]) {
                right++;
            }

            // One Array exhausted
            if (left >= arr1.length) {
                result.add(arr2[right]);
                right++;
                continue;
            }
            if (right >= arr2.length) {
                result.add(arr1[left]);
                left++;
                continue;
            }

            // Comparison
            if (arr1[left] < arr2[right]) {
                result.add(arr1[left]);
                left++;
            } else if (arr1[left] > arr2[right]) {
                result.add(arr2[right]);
            } else {
                result.add(arr1[left]);
                right++;
                left++;
            }
        }
        System.out.println(result);
    }
} */

// Intersection
import java.util.ArrayList;
import java.util.List;

public class Union_Intersection_ofArr {
    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 1, 3, 3, 2, 2 };
        int[] arr2 = { 3, 3, 3, 4 };

        int left = 0, right = 0;
        List<Integer> result = new ArrayList<>();
        while (left < arr1.length && right < arr2.length) {

            // Skip interation
            while (left > 0 && left < arr1.length && arr1[left] == arr1[left - 1]) { // left pointer is greater than first element, its lesser than the array size & equal to just-previous element
                left++;
            }
            while (right > 0 && right < arr2.length && arr2[right] == arr2[right - 1]) {
                right++;
            }

            // One Array exhausted
            if (left >= arr1.length || right>=arr2.length) {
               break;
            }

            // Comparison
            if (arr1[left] < arr2[right]) {
                left++;
            } else if (arr1[left] > arr2[right]) {
                right++;
            } else {
                result.add(arr1[left]);
                right++;
                left++;
            }
        }
        System.out.println(result);
    }
}