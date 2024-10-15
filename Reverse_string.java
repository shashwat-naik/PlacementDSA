import java.util.Scanner;
public class Reverse_string {
    public static String swap(String s, int i, int j) {
        StringBuilder str = new StringBuilder(s);
        str.setCharAt(i, s.charAt(j));
        str.setCharAt(j, s.charAt(i));

        return str.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            str = swap(str, start, end);
            start++;
            end--;
        }
        System.out.print(str);
    }
}