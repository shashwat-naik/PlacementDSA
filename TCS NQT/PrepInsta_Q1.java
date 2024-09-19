import java.util.Scanner;

public class PrepInsta_Q1 {
    public static String func(int x, int y, int[] arr) {
        arr[x - 1] = y;
        int ans = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1])
                ans += 1;
        }
        return "Student part of merit list: " + ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        System.out.print("Enter number of re-evaluations: ");
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < k; j++) {
            System.out.print("Enter matrix posn to update: ");
            int x = sc.nextInt();
            System.out.print("Enter re-evaluation marks: ");
            int y = sc.nextInt();
            System.out.println(func(x, y, arr));
        }
        sc.close();
    }
}
