import java.util.Arrays;

public class Stars_between_bars {
    public static int[] count(String s, int[] startIndex, int[] endIndex) {
        int n = s.length();

        int[] starCountPrefix = new int[n];
        int[] leftBar = new int[n];
        int[] rightBar = new int[n];

        int starCount = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '*')
                starCount++;
            starCountPrefix[i] = starCount;
        }

        int lastBar = -1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '|')
                lastBar = i;
            leftBar[i] = lastBar;
        }

        lastBar = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '|')
                lastBar = i;
            rightBar[i] = lastBar;
        }

        int m = startIndex.length;
        int[] result = new int[m];

        for (int i = 0; i < m; i++) {
            int start = startIndex[i];
            int end = endIndex[i];

            int left = rightBar[start];
            int right = leftBar[end];

            if (left != -1 && right != -1 && left < right)
                result[i] = starCountPrefix[right] - starCountPrefix[left];
            else
                result[i] = 0;
        }
        return result;
    }
    public static void main(String[] args) {
         String s = "|**|*|";
        int[] startIndex = {0, 0};
        int[] endIndex = {4, 5};

        int[] result = count(s, startIndex, endIndex);
        System.out.println(Arrays.toString(result));
    }
}
