import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrepInsta_Q10a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> listing = new ArrayList<>();
        int max = 20;
        int earning = 0;

        while (true) {
            String input = sc.nextLine();
            if (input.isEmpty())
                break;

            try {
                int age = Integer.parseInt(input);
                listing.add(age);
                if (listing.size() >= max)
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number!!");
            }
        }
        for (int age : listing) {
            if (age < 17)
                earning += 200;
            else if (age >= 17 && age <= 40)
                earning += 400;
            else if (age > 40 && age <= 120)
                earning += 300;
        }
        System.out.println("Total Income "+earning);
        sc.close();
    }
}
