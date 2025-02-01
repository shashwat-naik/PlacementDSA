public class Prepinsta_3 {
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void splitPalindrome(String s) {
        int n = s.length();
        for (int i = 1; i < n - 1; i++) {
            String palindrome1 = s.substring(0, i);
            if (!isPalindrome(palindrome1))
                continue;

            for (int j = i + 1; j < n - 1; j++) {
                String palindrome2 = s.substring(i, j);
                String palindrome3 = s.substring(j);

                if (isPalindrome(palindrome2) && isPalindrome(palindrome3)) {
                    System.out.println(palindrome1);
                    System.out.println(palindrome2);
                    System.out.println(palindrome3);
                    return;
                }
            }
        }
        System.out.println("Impossible");
    }

    public static void main(String[] args) {
        String word = "nayannamantenet";
        splitPalindrome(word);
    }
}
