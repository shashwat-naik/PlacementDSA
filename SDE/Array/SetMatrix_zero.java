// Optimize approach: First solve for the zero row and col and later for other element.  O(2*(n*m)) ~ O(n^2)  sp O(1);

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrix_zero {
    public static ArrayList<ArrayList<Integer>> setZero(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        int col0 = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    matrix.get(i).set(0, 0);

                    // here in [0][0] place for recording the col part we need to create a separate
                    // place which goes by the name col0.
                    if (j != 0) {
                        matrix.get(0).set(j, 0);
                    } else {
                        col0 = 0;
                    }
                }
            }
        }

        // For the inner element inside of the matrix
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix.get(i).get(j) != 0) {
                    if (matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0) {
                        matrix.get(i).set(j, 0);
                    }
                }
            }
        }
        if (matrix.get(0).get(0) == 0) {
            for (int j = 0; j < m; j++)
                matrix.get(0).set(j, 0);
        }
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix.get(i).set(0, 0);
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1, 1)));

        int n = matrix.size();
        int m = matrix.get(0).size();
        ArrayList<ArrayList<Integer>> ans = setZero(matrix, n, m);

        System.out.println("Final matrix: ");
        for (ArrayList<Integer> row : ans) {
            for (Integer value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}