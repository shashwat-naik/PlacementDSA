public class PrintAllSubsequence {
    /*
     * str: stores the input string
     * curr: stores current permutation
     * n: length of str
     * index: Index in current permutation, curr
     */
    static void SubSeqII(String str, int n, int index, String curr) {
        if (index == n)
            return;
        if (curr != null && !curr.trim().isEmpty())
            System.out.println(curr);

        for (int i = index + 1; i < n; i++) {
            curr += str.charAt(i);
            SubSeqII(str, n, i, curr);

            // backtracking
            curr = curr.substring(0, curr.length() - 1);
        }
    }

    static void SubSeqI(String str) {
        int index = -1;
        String curr = "";
        SubSeqII(str, str.length(), index, curr);
    }

    public static void main(String[] args) {
        String str = "Naik";
        SubSeqI(str);
    }
}