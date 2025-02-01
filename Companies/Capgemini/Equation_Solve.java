import java.util.Scanner;

public class Equation_Solve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values for a: ");
        int a = sc.nextInt();
        System.out.print("Enter the values for b: ");
        int b = sc.nextInt();

        int sum = (a + b) * (a + b) * (a + b);
        System.out.println(""+sum);
    }
}
