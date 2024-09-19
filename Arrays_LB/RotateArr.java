// Q- Left rotate the array by k place
/* Brute Approach: Store it into 2 array and combine it later
 * Optimal Approach: 
 */

public class RotateArr {
    public static void leftRotate(int[] arr, int n, int d) {
        d = d % n;

        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        for (int i = n - d; i < n; i++) {
            arr[i] = temp[i - (n - d)];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 3;
        leftRotate(arr, arr.length, d);

        System.out.println("Rotated Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

// GFG Question
/*
 * Q- Given an array arr, rotate the array by one position in clock-wise
 * direction.
 * Input: arr = [1, 2, 3, 4, 5]
 * Output: [5, 1, 2, 3, 4]
 * Explanation: If we rotate arr by one position in clockwise 5 come to the
 * front and remaining those are shifted to the end.
 * 
 * class Solution {
    public void rotate(int[] arr) {
        // code here
        int temp=arr[arr.length-1];

        for(int i=arr.length-1; i>0; i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
}
 */