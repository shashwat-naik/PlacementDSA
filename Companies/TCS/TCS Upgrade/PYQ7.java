import java.util.Arrays;
import java.util.Scanner;

public class PYQ7 {
    // Q1 Dutch flag problem (print the array in a sequence of 0,1,2)
    public static void SortNum(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    // Q2 Count the minimum number of element that have been placed wrong
    public static void main(String[] args) {
        int[] org = { 1, 2, 5, 4, 7, 9, 5 };
        int[] temp = new int[org.length];
        for (int i = 0; i < org.length; i++) {
            temp[i] = org[i];
        }
        Arrays.sort(temp);

        int count = 0;

        for (int i = 0; i < org.length; i++) {
            if (org[i] != temp[i])
                count++;
        }
        System.out.println("Minimum number of elements to be removed: " + count);
    }
}
