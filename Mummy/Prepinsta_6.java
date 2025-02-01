import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Prepinsta_6 {
    public static int nearestlarge(int a, int b) {
        char[] digit = String.valueOf(a).toCharArray();
        List<Integer> permutation = new ArrayList<>();

        generatePermutation(digit, 0, permutation);
        Collections.sort(permutation);

        for (int num : permutation)
            if (num > b)
                return num;

        return -1;
    }

    private static void generatePermutation(char[] digit, int index, List<Integer> result) {
        if (index == digit.length) {
            result.add(Integer.parseInt(new String(digit)));
            return;
        }

        for (int i = index; i < digit.length; i++) {
            swap(digit, i, index);
            generatePermutation(digit, index + 1, result);
            swap(digit, i, index);
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = nearestlarge(a, b);
        System.out.println(result);

        sc.close();
    }
}
