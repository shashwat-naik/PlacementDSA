public class Prepinsta_1 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int n = arr.length;
        int rotation = 2;
        int[] ans = new int[n];

        int end = n - rotation;
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[end % n]; // Circular array iteration.
            end++;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}