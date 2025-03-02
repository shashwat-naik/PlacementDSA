import java.util.Scanner;

public class ShoppingOnBudget {
    public static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int maxSpent = -1;
        
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                int total = keyboards[i] + drives[j];
                if (total <= b && total > maxSpent) {  
                    maxSpent = total;
                }
            }
        }
        return maxSpent;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int budget = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] keyboards = new int[n];
        for (int i = 0; i < n; i++) {
            keyboards[i] = sc.nextInt();
        }

        int[] drives = new int[m];
        for (int i = 0; i < m; i++) {
            drives[i] = sc.nextInt();
        }

        int ans = getMoneySpent(keyboards, drives, budget);
        System.out.println(ans);
        
        sc.close();
    }
}
