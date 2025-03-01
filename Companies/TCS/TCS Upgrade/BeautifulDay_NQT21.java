import java.util.Scanner;

public class BeautifulDay_NQT21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();

        int count = 0;
        for (int num = i; num <= j; num++) {
            int numCopy = num, numRev = 0;
            while (numCopy > 0) {
                numRev = (numRev * 10) + (numCopy % 10);
                numCopy /= 10;
            }
            if ((num - numRev) % k == 0)
                count++;
        }
        System.out.println(count);
        sc.close();
    }
}
