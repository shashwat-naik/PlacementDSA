public class Sum_ofDigit_palindrome {
    public static int palindrome_sum(int number) {
        int sum = 0, reverse = 0;

        // Sum calculation for the integer
        while (number != 0) {
            int temp = number % 10;
            sum += temp;
            number /= 10;
        }

        // Palindrome check for the sum of the integer
        int original = sum;
        while (sum != 0) {
            int temp = sum % 10;
            reverse = reverse * 10 + temp;
            sum /= 10;
        }

        if (reverse != original)
            return 0;
        else
            return 1;
    }

    public static void main(String[] args) {
        int number = 56;
        int result = palindrome_sum(number);
        System.out.println(result);
    }
}
