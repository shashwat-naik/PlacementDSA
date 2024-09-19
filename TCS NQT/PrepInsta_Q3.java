public class PrepInsta_Q3 {
    public static int[] findRoom(int n, int k, int[] coin) {
        int start = 0, end = 0, currSum = 0;
        int[] result = { 0, Integer.MAX_VALUE };

        while (end < n) {
            currSum += coin[end];
            while (currSum > k) {
                currSum -= coin[start];
                start++;
            }
            if (currSum == k && (end - start < result[1] - result[0])) {
                result[0] = start;
                result[1] = end;
            }
            end++;
        }
        if (result[1] == Integer.MAX_VALUE)
            System.out.println("No sol found");

        return result;
    }

    public static void main(String[] args) {
        int[] coin = { 5, 3, 7, 14, 18, 1, 18, 4, 3, 8 };
        int k = 15;
        int[] ans = findRoom(coin.length, k, coin);
        System.out.println("Enter room no " + (ans[0] + 1) + " and exit room " + (ans[1] + 1));
    }
}
