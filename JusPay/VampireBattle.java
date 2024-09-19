import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class VampireBattle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the population of the town: ");
        int n = sc.nextInt();

        System.out.print("Enter the power of each human's blood: ");
        String powerStr = sc.next();

        ArrayList<Integer> powers = new ArrayList<>();
        for (char c : powerStr.toCharArray()) {
            powers.add(c - '0');
        }

        Collections.sort(powers, Collections.reverseOrder());

        int totalPower = 0;
        for (int power : powers) {
            totalPower += power;
        }

        int stephanPower = 0;
        int damonPower = totalPower;
        int i = 0;

        while (stephanPower <= damonPower) {
            int currentPower = powers.get(i);
            stephanPower += currentPower;
            damonPower -= currentPower;
            i++;
        }

        System.out.println("Stephan's total power: " + stephanPower);

        sc.close();
    }
}
