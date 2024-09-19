import java.util.Scanner;

public class trial {
    public static void main(String[] args) {
        /*
         * String x = "All the Best";
         * String y="";
         * for (int i = 0; i < x.length(); i++) {
         * if (x.charAt(i) == ' ') { // Change made: Check if character is a space
         * y += ' '; // Append a space to the result
         * } else {
         * y += (char) (x.charAt(i) + 1); // Increment the character by 1 and append
         * }
         * }
         * System.out.println(y);
         */

        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.print("Enter the year to know the year is leap or not: ");
         * int year = sc.nextInt();
         * if (year % 400 == 0)
         * System.out.println("Leap Year");
         * else if (year % 100 == 0)
         * System.out.println("Not a Leap Year");
         * else if (year % 4 == 0)
         * System.out.println("Leap Year");
         * else
         * System.out.println("Not a leap year");
         * 
         * sc.close();
         */

        Scanner sc = new Scanner(System.in);
        int term = sc.nextInt();
        int result = 0;
        // if (term % 2 == 0 && term != 0 && term != 1) {
        //     result = 6 * (term / 2) - 1;
        if (term % 2 == 0) 
            result = 6 * (term / 2);
        else
            result = 7 * (term - 1) / 2;

        System.out.println(term + "th term is: " + result);
        sc.close();
    }
}
