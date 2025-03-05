import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PYQ4 {
    // Q1 Calculate the counts of each char and return +/-/0.
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count1 = 0, count2 = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '#')
                count1++;
            else if (input.charAt(i) == '*')
                count2++;
        }
        if (count1 > count2)
            System.out.println("Positive");
        else if (count1 < count2)
            System.out.println("Negative");
        else
            System.out.println(0);
        sc.close();
    }

    // Q2** 2 wheeler & 4 wheeler number from information
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int v = sc.nextInt();
//         int w = sc.nextInt();

//         float x = ((4 * v) - w) / 2;
//         if (w >= 2 && w % 2 == 0 && v < w)
//             System.out.println((int) x + " " + (v - (int) x));
//         else
//             System.out.println("Invalid Input");
//         sc.close();
//     }

//     // Q3** From the list of currency notes find the perfect sequence
//     public static void main(String[] args) {

//         Integer[] arr = { 1, 5, 10, 50, 100, 500, 1000 };
//         int n = arr.length;
//         int V = 70;
//         int count = 0;

//         Arrays.sort(arr, Collections.reverseOrder());
//         for (int i = 0; i < n; i++) {
//             while (V >= arr[i]) {
//                 V -= arr[i];
//                 count++;
//             }
//         }
//         System.out.println("Min num of denominations: " + count);

//     }
}