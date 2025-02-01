
public class Accenture_SpecialFibonacci {
    public static int solving(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        int ans1 = solving(n - 1);
        int ans2 = solving(n - 2);

        int total = ans1 * ans1 + ans2 * ans2;
        return total % 47;
    }

    public static void main(String[] args) {
        int input = 5;
        int ans = solving(input);
        System.out.println(ans);
    }
}