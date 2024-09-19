public class MaxConsecutive_1 {
    public static int counting(int[] arr) {
        int count = 0, maximum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                count++;
            else
                count = 0;

            maximum = Math.max(maximum, count);
        }
        return maximum;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 0, 1, 1, 1 };
        int ans = counting(nums);
        System.out.println("The maximum  consecutive 1's are " + ans);
    }
}
