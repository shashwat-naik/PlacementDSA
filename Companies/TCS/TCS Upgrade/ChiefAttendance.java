import java.util.HashMap;
import java.util.Scanner;

public class ChiefAttendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  
        while (t-- > 0) {
            int n = sc.nextInt();
            String[] fName = new String[n], lName = new String[n];
            HashMap<String, Integer> nameCount = new HashMap<>();

            for (int i = 0; i < n; i++) {
                fName[i] = sc.next();
                lName[i] = sc.next();
                nameCount.put(fName[i], nameCount.getOrDefault(fName[i], 0) + 1);
            }

            for (int i = 0; i < n; i++) {
                if (nameCount.get(fName[i]) == 1) {
                    System.out.println(fName[i]);
                } else {
                    System.out.println(fName[i] + " " + lName[i]);
                }
            }
        }
        sc.close();
    }
}
