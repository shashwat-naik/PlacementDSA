import java.util.ArrayList;
import java.util.List;

public class Backtracking {
    public static void printpermutation(String str, String permute, int idx) {
        if (str.length() == 0) {
            System.out.println(permute);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printpermutation(newStr, permute + currChar, idx + 1);
        }
    }

    public boolean isSafe(int row, int col, char[][] board) {
        // Horizontal
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') return false;
        }
        // Vertical
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') return false;
        }
        // Upper Left
        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') return false;
        }
        // Upper Right
        r = row;
        for (int c = col; c < board.length && r >= 0; r--, c++) {
            if (board[r][c] == 'Q') return false;
        }
        // Lower Left
        r = row;
        for (int c = col; c >= 0 && r < board.length; r++, c--) {
            if (board[r][c] == 'Q') return false;
        }
        // Lower Right
        for (int c = col; c < board.length && r < board.length; c++, r++) {
            if (board[r][c] == 'Q') return false;
        }
        return true;
    }

    public void saveBoard(char[][] board, List<List<String>> allBoard) {
        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q') row.append('Q');
                else row.append('.');
            }
            newBoard.add(row.toString());
        }
        allBoard.add(newBoard);
    }

    public void helper(char[][] board, List<List<String>> allBoard, int col) {
        if (col == board.length) {
            saveBoard(board, allBoard);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoard, col + 1);
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoard = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize the board with empty spaces represented by '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        helper(board, allBoard, 0);
        return allBoard;
    }

    public static void main(String[] args) {
        String str = "ABC";
        printpermutation(str, "", 0);
        System.out.println( );

        Backtracking nQueens = new Backtracking();
        int n = 4; // Desired value of n
        List<List<String>> solutions = nQueens.solveNQueens(n);

        // Print all solutions
        System.out.println("Total solutions: " + solutions.size());
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println(); // Separate different solutions
        }
    }
}
