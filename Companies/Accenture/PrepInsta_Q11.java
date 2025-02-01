import java.util.Scanner;

public class PrepInsta_Q11 {

    public static void replace(String str, char c1, char c2) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c1)
                res = res + c2;
            else if (str.charAt(i) == c2)
                res = res + c1;
            else
                res = res + str.charAt(i);
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string followed by 2 character to be swapped within:-");
        String str = sc.next();
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);

        replace(str, ch1, ch2);
        sc.close();
    }
}
