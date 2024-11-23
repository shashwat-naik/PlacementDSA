/* public class Palindrome {

    // Number 
    public static boolean palindrome(int n) {
        int original = n;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        return original == reverse;
    }

    public static void main(String[] args) {
        int num = 1551;
        if (palindrome(num))
            System.out.println(num + " is Palindrome");
        else
            System.out.println(num + " is Not a Palindrome");
    }
} */

/* public class Palindrome {

    // String
    public static boolean palindromeString(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (right < left) {
            if (str.charAt(right) != str.charAt(left))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "Naman";
        if (palindromeString(str))
            System.out.println(str + " is PALINDROME");
        else
            System.out.println(str + " is NOT PALINDROME");
    }
} */

public class Palindrome {
    public static boolean palindromeArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right])
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 1 };
        if (palindromeArray(arr))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
