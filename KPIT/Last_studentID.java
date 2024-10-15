import java.util.Scanner;
import java.util.TreeSet;

public class Last_studentID {
    public static String lastString(char[] set) {
        int n = set.length;
        String temp;
        TreeSet<String> list = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            temp = "";
            for (int j = i; j < n; j++) {
                temp = temp + set[j];
                list.add(temp);
            }
        }
        return list.last();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();
        char[] arr = str.toCharArray();

        System.out.println(lastString(arr));
    }
}
