public class Palindrome_BinaryDecimal {
    public static String BothDecimalBinary(Long number) {
        String str = Long.toBinaryString(number);
        int start = 0;
        int last = str.length() - 1;
        while (start < last) {
            if (str.charAt(start) != str.charAt(last))
                return "No";
            start++;
            last--;
        }
        return "Yes";
    }

    public static void main(String[] args) {
        long number = 7;
        String result = BothDecimalBinary(number);
        System.out.println(result);
    }
}
