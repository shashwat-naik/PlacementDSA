import java.util.Scanner;

public class PrepInsta_Q8a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int schemeAmt = 5000;

        System.out.print("Enter the name: ");
        String parent = sc.nextLine();
        System.out.print("Are you a parent(Y/N): ");
        String check = sc.nextLine();

        int totalMember = 1;
        double Parentcomm = 0;
        double Childcomm = 0.05 * schemeAmt;

        if (check.equalsIgnoreCase("Y")) {
            System.out.print("Enter name of child members (comma separated): ");
            String[] children = sc.nextLine().split(",");

            totalMember += children.length;
            Parentcomm = 0.10 * schemeAmt * children.length;

            System.out.println("TOTAL MEMBERS: " + totalMember);
            System.out.println("COMMISSION DETAILS: ");
            System.out.println(parent + ": " + Parentcomm + " INR");
            for (String child : children) {
                child = child.trim();
                System.out.println(child + ": " + Childcomm + " INR");
            }
        } else {
            Parentcomm = 0.05 * schemeAmt;
            System.out.println("TOTAL MEMBERS: " + totalMember);
            System.out.println("COMMISSION DETAILS: ");
            System.out.println(parent + ": " + Parentcomm + " INR");
        }
        sc.close();
    }
}
