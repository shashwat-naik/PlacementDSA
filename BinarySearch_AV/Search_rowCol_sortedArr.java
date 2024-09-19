public class Search_rowCol_sortedArr {
    public static void search(int[][] arr, int n, int target) {
        int i = 0;
        int j = n - 1;
        while (i < n && j >= 0 && i < n && j < n) {
            if (arr[i][j] == target) {
                System.out.println("Element found (" + i + "," + j + ")");
                return;
            } else if (arr[i][j] > target)
                j--;
            else
                i++;
        }
        System.out.println("Element not found");
        return;
    }

    public static void main(String[] args) {
        int mat[][] = { { 10, 20, 30, 40 },
                        { 15, 25, 35, 45 },
                        { 27, 29, 37, 48 },
                        { 32, 33, 39, 50 } };

        search(mat, 4, 29);
    }
}