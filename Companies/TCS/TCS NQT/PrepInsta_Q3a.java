import java.util.Scanner;

public class PrepInsta_Q3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        
        // Input matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        int max = 0;  // To store the maximum count of consecutive 1s
        int index = -1;  // To store the row index with the maximum consecutive 1s
        
        // Traverse each row
        for (int i = 0; i < row; i++) {
            int count = 0, record = 0;  // Reset for each row
            
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 1) {
                    count++;  // Increment count for consecutive 1s
                } else {
                    record = Math.max(record, count);  // Update record for the row
                    count = 0;  // Reset count as consecutive 1s are broken
                }
            }
            // Update record for the last set of 1s in the row, in case it ends with 1s
            record = Math.max(record, count);
            
            // Update max and index if a row with more consecutive 1s is found
            if (record > max) {
                max = record;
                index = i + 1;  // Storing 1-based row index
            }
        }
        
        System.out.println(index);  // Output the row with the maximum consecutive 1s
        sc.close();
    }
}
