// Q- (i) reverse a given array (ii) reverse the value after the value provided

public class Reverse_arr {
    public static void reverse1(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void reverse2(int[] arr, int m) {
        int i = m + 1;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12, 14 };
        int[] arr1 = { 2, 4, 6, 8, 10, 12, 14 };

        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println("\nAfter reversing: ");
        
        System.out.println("Part 1");

        reverse1(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nPart 2");

        reverse2(arr1, 2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
