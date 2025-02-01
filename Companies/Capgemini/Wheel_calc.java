import java.util.Scanner;

public class Wheel_calc {
    public static void wheel(int dealer, int[] arr1, int[] arr2) {
        System.out.println("Total " + dealer + " dealership");
        for (int i = 0; i < dealer; i++) {
            System.out.println("Dealership " + (i + 1) + " contains " + arr1[i] + " cars and " + arr2[i] + " bikes.");
        }
        for (int i = 0; i < dealer; i++) {
            System.out.println(
                    "Total number of tyres in dealership " + (i + 1) + " => " + ((arr1[i] * 4) + (arr2[i] * 2)));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of dealership: ");
        int dealer = sc.nextInt();
        System.out.println("Enter the number of cars & bikes: ");
        int[] car = new int[dealer];
        int[] bike = new int[dealer];
        for (int i = 0; i < dealer; i++) {
            car[i] = sc.nextInt();
            bike[i] = sc.nextInt();
        }
        wheel(dealer, car, bike);
    }
}
