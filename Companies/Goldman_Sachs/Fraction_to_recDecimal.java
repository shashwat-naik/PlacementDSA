import java.util.Scanner;
import java.util.HashMap;

public class Fraction_to_recDecimal {
    public static String fractionToDecimal(int nume, int denom) {
        if (nume == 0)
            return "0";

        StringBuilder ans = new StringBuilder();
        if ((nume < 0) ^ (denom < 0))
            ans.append("-");

        long num = Math.abs((long) nume);
        long den = Math.abs((long) denom);

        ans.append(num / den);
        num %= den;
        if (num == 0)
            return ans.toString();

        ans.append(".");
        HashMap<Long, Integer> map = new HashMap<>();

        while (num != 0) {
            if (map.containsKey(num)) {
                ans.insert(map.get(num), "(");
                ans.append(")");
                break;
            }
            map.put(num, ans.length());
            num *= 10;
            ans.append(num / den);
            num %= den;
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator = sc.nextInt();
        int denominator = sc.nextInt();

        System.out.println(fractionToDecimal(numerator, denominator));
        sc.close();
    }
}
