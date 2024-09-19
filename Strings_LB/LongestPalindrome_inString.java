public class LongestPalindrome_inString {
    static String longPalindrome(String s) {
        String sub = s.substring(0, 1);

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                int j = i, k = i + 1;

                while (j >= 0 && k < s.length()) {
                    if (s.charAt(j) != s.charAt(k))
                        break;
                    j--;
                    k++;
                }
                if (sub.length() < k - j - 1) {
                    sub = s.substring(j + 1, k);
                }
            }
            if (i > 0) {
                if (s.charAt(i - 1) == s.charAt(i + 1)) {
                    int x = i - 1, y = i + 1;
                    while (x >= 0 && y < s.length()) {
                        if (s.charAt(x) != s.charAt(y))
                            break;
                        x--;
                        y++;
                    }
                    if (sub.length() < y - x - 1) {
                        sub = s.substring(x + 1, y);
                    }
                }
            }
        }
        return sub;
    }

    public static void main(String[] args) {
        String str = "aaaabbaa";
        String result = longPalindrome(str);
        System.out.println("Longest Palindromic Substring: " + result);
    }
}
