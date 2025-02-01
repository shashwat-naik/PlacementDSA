import java.util.Scanner;

public class Matrix_SpiralTraverse {
    public static void spiralFormat(int row, int col, int[][] mat) {
        int top = 0, bottom = row - 1, left = 0, right = col - 1;
        while (top <= bottom && left <= right) {

            // a[0][0] -> a[0][1] -> ... a[0][col-1] (left -> right)
            for (int i = left; i <= right; i++)
                System.out.print(mat[top][i] + " ");
            top++;

            // a[0][col-1] -> a[1][col-1] -> ... a[row-1][col-1] (top -> bottom)
            for (int i = top; i <= bottom; i++)
                System.out.print(mat[i][right] + " ");
            right--;

            // a[row-1][col-1] -> ... a[row-1][1] -> a[row-1][0] (left -> right)
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    System.out.print(mat[bottom][i] + " ");
                bottom--;
            }

            // a[row-1][0] -> ... a[2][0] -> a[1][0] (bottom -> top)
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    System.out.print(mat[i][left] + " ");
                left++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row and Col: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        System.out.println("Enter content for the matrix: ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("In spiral format:- ");
        spiralFormat(row, col, mat);
    }
}
