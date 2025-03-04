import java.util.Scanner;

public class PYQ2 {
    // Q1 Picking number from arr in a way that num-1>num<num+1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i - 1] > arr[i] && arr[i] < arr[i + 1])
                count++;
        }
        System.out.println(count);
        sc.close();
    }

    // Q2 Reverse the String
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] words = input.split("\\s+");
        StringBuilder reverse = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reverse.append(words[i]);
            if (i > 0)
                reverse.append(" ");
        }
        System.out.println(reverse.toString());
        sc.close();
    }

    // Q3 Automorphic
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = true;
        int squared = num * num;

        while (num > 0) {
            if (num % 10 != squared % 10) {
                flag = false;
                break;
            }
            num /= 10;
            squared /= 10;
        }
        if (flag)
            System.out.println("Automorphic Number ");
        else
            System.out.println("Not an Automorphic Number ");

        sc.close();
    }
}