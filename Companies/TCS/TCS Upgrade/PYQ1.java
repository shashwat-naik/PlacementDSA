import java.util.Scanner;
import java.util.ArrayList;

public class PYQ1 {

    // Q1 Rock Sample Problem

    public static ArrayList<Integer> findRockSample(int[][] ranges, int[] arr,
            int n, int r) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < r; i++) {
            int count = 0;
            int start = Math.min(ranges[i][0], ranges[i][1]);
            int end = Math.max(ranges[i][0], ranges[i][1]);

            // in short
            // * int start=ranges[i][0];
            // * int end=ranges[i][1];

            for (int j = 0; j < n; j++) {
                if (start <= arr[j] && arr[j] <= end) {
                    count++;
                }
            }
            ans.add(count);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int r = sc.nextInt();
        int[][] ranges = new int[r][2];

        for (int i = 0; i < r; i++) {
            ranges[i][0] = sc.nextInt();
            ranges[i][1] = sc.nextInt();
        }

        ArrayList<Integer> answer = findRockSample(ranges, arr, n, r);

        for (int num : answer) {
            System.out.print(num + " ");
        }
        System.out.println();
        sc.close();
    }

    // Q2 Find vowels, consonants and spaces from the string

    /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String content = sc.nextLine();

        int vowels = 0, consonants = 0, spaces = 0;

        for (int i = 0; i < content.length(); i++) {
            char ch = Character.toLowerCase(content.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowels++;
            else if (ch == ' ')
                spaces++;
            else
                consonants++;
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Spaces: " + spaces);
        sc.close();
    }

    // Q3 Replace the '0' to '1' from a number

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = 1, digit, ans = 0;

        while (number > 0) {
            digit = number % 10;
            if (digit == 0)
                digit = 1;
            ans = digit * temp + ans;
            temp = temp * 10;
            number /= 10;
        }
        System.out.println(ans);
        sc.close();
    } */
}