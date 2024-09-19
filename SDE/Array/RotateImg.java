/* Brute Approach: take a dummy matrix of n*n and then take the first row of the matrix is put into last cl of the dummy matrix  O(n*n) O(n*n)
 * Optimal Approach: Transposing the matrix and reversing each each row. O(n*n) O(1) 
*/

public class RotateImg {

    public static void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix.length / 2; y++) {
                int temp = 0;
                temp = matrix[x][y];
                matrix[x][y] = matrix[x][matrix.length - 1 - y];
                matrix[x][matrix.length - 1 - y] = temp;
            }
        }
    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rotate(arr);
        System.out.println("Rotated Image");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
