public class second_large_small_element {
    public static int secSmall(int[] arr, int n) {
        if (n < 2)
            return -1;

        int small = Integer.MAX_VALUE;
        int Sec_small = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < small) {
                Sec_small = small;
                small = arr[i];
            } else if (arr[i] < Sec_small && arr[i] != small)
                Sec_small = arr[i];
        }
        return Sec_small;
    }

    public static int secLarge(int[] arr, int n) {
        if (n < 2)
            return -1;

        int large = Integer.MIN_VALUE;
        int Sec_large = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > large) {
                Sec_large = large;
                large = arr[i];
            } else if (arr[i] > Sec_large && arr[i] != large)
                Sec_large = arr[i];
        }
        return Sec_large;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 7, 7, 5};
        int ans1 = secLarge(arr, arr.length);
        int ans2 = secSmall(arr, arr.length);

        System.out.println("Second largest: " + ans1 + "\n" + "Second smallest: " + ans2);
    }
}
