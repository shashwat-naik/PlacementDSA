public class PrepInsta_Q19 {
    public static void find(int[] arr, int n) {
        int max = arr[0], index = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }

    public static void main(String[] args) {
        int[] arr = { 23, 45, 82, 27, 66, 12, 78, 13, 71, 86 };
        find(arr, arr.length);
    }
}
