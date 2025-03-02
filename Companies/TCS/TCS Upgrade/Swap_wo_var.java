import java.util.Scanner;

public class Swap_wo_var {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a ");
        int num = sc.nextInt();
        System.out.print("b ");
        int num2 = sc.nextInt();

        num = num + num2;
        num2 = num - num2;
        num = num - num2;

        System.out.println("a "+num + " b " + num2);
        sc.close();
    }
}
