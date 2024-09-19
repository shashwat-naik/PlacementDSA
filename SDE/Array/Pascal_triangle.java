import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pascal_triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0)
            return result;
        if (numRows == 1) {
            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            result.add(firstRow);
            return result;
        }
        result = generate(numRows - 1);
        List<Integer> prevRow = result.get(numRows - 2);
        List<Integer> currRow = new ArrayList<>();
        currRow.add(1);

        for (int i = 1; i < numRows - 1; i++) {
            currRow.add(prevRow.get(i - 1) + prevRow.get(i));
        }

        currRow.add(1);
        result.add(currRow);

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = scanner.nextInt();

        Pascal_triangle pt = new Pascal_triangle();
        List<List<Integer>> pascalTriangle = pt.generate(numRows);

        System.out.println("Pascal's Triangle:");
        for (List<Integer> row : pascalTriangle) {
            for (Integer num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}