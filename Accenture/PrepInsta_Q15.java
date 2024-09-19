import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class PrepInsta_Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int arrsize = sc.nextInt();
        int[] arr = new int[arrsize];

        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

        System.out.println("Entered size " + arrsize);

        for (int i = 0; i < arrsize; i++)
            arr[i] = sc.nextInt();
        for (int j = 0; j < arrsize; j++) {
            if (j % 2 == 0)
                even.add(arr[j]);
            else
                odd.add(arr[j]);
        }
        Collections.sort(even);
        Collections.sort(odd);
        System.out.println("Sorted even array");

        for (int e : even)
            System.out.print(e + " ");
        System.out.println();
        System.out.println("Sorted odd array");

        for (int e : odd)
            System.out.print(e + " ");
        System.out.println();

    }
}
