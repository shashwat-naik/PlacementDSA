import java.util.HashSet;
import java.util.Scanner;

public class Recursion_lvl2 {
    public static void towerHanoi(int n, String src, String help, String dest) {
        if (n == 1) {
            System.out.println(n + " from " + src + " => " + dest);
            return;
        }
        towerHanoi(n - 1, help, dest, help);
        System.out.println(n + " from " + src + " => " + dest);
        towerHanoi(n - 1, help, src, dest);
    }

    public static void printRev(String str, int index) {
        if (index == 0) {
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        printRev(str, index - 1);
    }

    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int index, char ele) {
        if (index == str.length()) {
            System.out.println("1st occ: " + first + " | 2nd occ: " + last);
            return;
        }
        char currChar = str.charAt(index);
        if (currChar == ele) {
            if (first == -1)
                first = index;
            else
                last = index;
        }
        findOccurance(str, index + 1, ele);
    }

    public static boolean incrSort(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] < arr[idx + 1]) {
            return incrSort(arr, idx + 1);
        } else {
            return false;
        }
    }

    public static void moveX(String str, int idx, int count, String newStr) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if (currChar == 'x') {
            count++;
            moveX(str, idx + 1, count, newStr);
        } else {
            newStr += currChar;
            moveX(str, idx + 1, count, newStr);
        }
    }

    public static boolean[] map = new boolean[26];

    public static void removeDup(String str, int idx, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);

        if (map[currChar - 'a'] == true)
            removeDup(str, idx + 1, newStr);
        else {
            newStr += currChar;
            map[currChar - 'a'] = true;
            removeDup(str, idx + 1, newStr);
        }
    }

    public static void subseq(String str, int idx, String newStr) {

        if (idx == str.length()) {
            System.out.print(newStr + " ");
            return;
        }

        char currChar = str.charAt(idx);
        // getting involved
        subseq(str, idx + 1, newStr + currChar);
        // for non-involvement
        subseq(str, idx + 1, newStr);
    }

    public static void uniqSubseq(String str, int idx, String newStr, HashSet<String> allSeq) {
        if (idx == str.length()) {
            if (allSeq.contains(newStr))
                return;
            else {
                System.out.print(newStr + " ");
                allSeq.add(newStr);
                return;
            }
        }
        char currChar = str.charAt(idx);
        uniqSubseq(str, idx + 1, newStr + currChar, allSeq);
        uniqSubseq(str, idx + 1, newStr, allSeq);
    }

    public static String[] keypad = { " ", ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static void comb(String str, int idx, String combination) {

        if (idx == str.length()) {
            System.out.print(combination + " ");
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            comb(str, idx + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        towerHanoi(x, "S", "H", "D");

        String str = "abcd";
        printRev(str, str.length() - 1);

        String strI = "abaacdaefaah";
        findOccurance(strI, 0, 'a');

        int[] arr = { 1, 4, 5, 7 };
        System.out.println(incrSort(arr, 0));

        String strII = "axbcxxd";
        moveX(strII, 0, 0, "");

        String strIII = "abbccda";
        removeDup(strIII, 0, "");

        String strIV = "abc";
        subseq(strIV, 0, "");
        System.out.println();

        String strV = "aaa";
        HashSet<String> allSeq = new HashSet<>();
        uniqSubseq(strV, 0, "", allSeq);
        System.out.println();

        String strVI = "23";
        comb(strVI, 0, "");
    }
}
