public class reverseArr {
    public static void print(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }

    public static void reverse(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 4, 5, 2 };
        reverse(arr, 0, arr.length - 1);
        print(arr, arr.length);
    }
}
