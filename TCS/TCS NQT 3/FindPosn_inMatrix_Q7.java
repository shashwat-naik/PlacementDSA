public class FindPosn_inMatrix_Q7 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };
        int x = 29;
        searchMatrix(matrix, x);
    }

    public static void searchMatrix(int[][] matrix, int x) {
        int n = matrix.length; 
        int row = 0;
        int col = n - 1; 

        while (row < n && col >= 0) {
            if (matrix[row][col] == x) {
                System.out.println("Found at (" + row + ", " + col + ")");
                return;
            } else if (matrix[row][col] > x) {
                col--; // Move left
            } else {
                row++; // Move down
            }
        }

        System.out.println("Element not found");
    }
}
