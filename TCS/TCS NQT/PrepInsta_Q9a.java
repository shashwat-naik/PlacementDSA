import java.util.Scanner;

public class PrepInsta_Q9a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c[] = { "Espresso Coffee", "Cappuccino Coffee", "Latte Coffee" };
        String t[] = { "Plain Tea", "Assam Tea", "Ginger Tea", "Cardamom Tea", "Masala Tea", "Lemon Tea", "Green Tea",
                "Organic Darjeeling Tea" };
        String s[] = { "Hot and Sour Soup", "Veg Corn Soup", "Tomato Soup", "Spicy Tomato Soup" };
        String b[] = { "Hot Chocolate Drink", "Badam Drink", "Badam-Pista Drink" };

        System.out.print("Enter category of drinks (c, t, s, b): ");
        String category = sc.nextLine();
        System.out.print("Enter variety from the category: ");
        int n = sc.nextInt();

        String res = "";

        if (category.equalsIgnoreCase("c") && n <= 3 && n > 0) {
            res = c[n - 1];
        } else if (category.equalsIgnoreCase("t") && n <= 8 && n > 0) {
            res = t[n - 1];
        } else if (category.equalsIgnoreCase("s") && n <= 4 && n > 0) {
            res = s[n - 1];
        } else if (category.equalsIgnoreCase("b") && n <= 3 && n > 0) {
            res = b[n - 1];
        } else {
            System.out.println("Invalid Input");
            sc.close();
            return;
        }

        System.out.println("Welcome to CCD!" + "\nEnjoy your " + res);
        sc.close();
    }
}
