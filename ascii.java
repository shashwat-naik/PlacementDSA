import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character: ");
        char c = sc.next().charAt(0);
        int ascii = c;

        System.out.println("Ascii value of " + c + " => " + ascii);
        sc.close();
    }
}
