import java.util.Scanner;

public class Password_Robot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter passsword: ");
        String example = sc.nextLine();

        if (example.length() < 6) {
            System.out.println("Invalid Password");
            return;
        }
        boolean number = false, upperCase = false, lowerCase = false;
        boolean validPassword = true;
        for (int i = 0; i < example.length() - 1; i++) {
            char ch = example.charAt(i);

            if (ch == '/' || ch == ' ') {
                System.out.println("Invalid Password");
                validPassword = false;
                break;
            }

            if (Character.isUpperCase(ch))
                upperCase = true;
            if (Character.isLowerCase(ch))
                lowerCase = true;
            if (Character.isDigit(ch))
                number = true;
        }
        if (validPassword) {
            if (upperCase && lowerCase && number)
                System.out.println("Correct Password");
            else
                System.out.println("Invalid Passwprd");
        }
    }
}
