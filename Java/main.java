import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Basic
        System.out.println("Hello myself Shashwat");

        // Variable
        String x = "Shashwat";
        int num = 20;
        System.out.println(num);

        // Java types 1)Primitive (with a limit) 2)Reference (not bound of limit i.e
        // sentence)
        /* byte-1 short-2 int-4 long-8 float-4 double-8 char-2 boolean-1 T/F */
        byte age = 12;
        int phone = 1999999999;
        long phone2 = 12345678900L;
        float pi = 3.14F;
        char letter = '@';
        boolean adult = false;

        String greet = "Hello buddy i am shashwat";
        System.out.println("Hello " + greet);

        String name = "Naik";
        System.out.println(name.length());

        // with "new" keyword we make object for the classes
        String hello = new String("new string");
        System.out.println(hello);

        // Strings (In java strings are immutable i.e they dont get changed into the
        // original state value.)
        String part1 = "Shashwat";
        String part2 = "Naik";
        String result = part1 + part2; // System.out.println(result); ==> ShashwatNaik

        // CharAt used for checking out which character is present at what position
        String name1 = "Shashwat";
        System.out.println(name1.charAt(0));

        // Replace
        String name2 = name1.replace('a', 's');
        System.out.println(name2);

        // SubString- from a string separating out one of its part
        String sample = "My name is shashwat naik";
        System.out.println(sample.substring(0, 4));

        // Arrays
        Scanner z = new Scanner(System.in);

        System.out.println("Enter the desired size for tha array: ");
        int n = z.nextInt();
        int[] marks = new int[n];

        System.out.println("Enter the values for the array: ");
        for (int i = 0; i < n; i++) {
            marks[i] = z.nextInt();
        }

        // Sorting the array
        int[] hello1 = new int[4];
        hello1[0] = 92;
        hello1[1] = 22;
        hello1[2] = 52;
        hello1[3] = 72;

        System.out.println(hello1[0]);
        Arrays.sort(hello1);
        System.out.println(hello1[0]);

        int[][] finalmarks = { { 1, 2, 3 }, { 4, 5, 6 } }; // this is the array for the 2 student [0][0]--> first
                                                           // student first marks [1][0]--> second student first marks.
        System.out.println(finalmarks[1][0]);

        // Casting 1)Implicit [small to big conversion] 2)Explicit [big to small no
        // matter with any data loss]
        double price = 100.00;
        double finalPrice = price + 18; // adding double with int
        System.out.println(finalPrice); // implicit one

        int p = 100;
        int fP = p + (int) 18.99; // adding int with double
        System.out.println(fP); // explicit one

        // constants
        int Age = 20;
        Age = 21;
        Age = 22;

        final float PI = 3.14F; // adding "final" fixes a value for a variable through the code

        // Math
        System.out.println(Math.max(10, 12));
        System.out.println(Math.min(10, 12));
        System.out.println(Math.random()); // print random value between 0.0 to 1.0
        System.out.println((int) (Math.random() * 100));

        double randomVal = Math.random() * 10;
        long roundOff = Math.round(randomVal);
        System.out.println(roundOff);

        // Comparison Operators
        /*
         * a == b
         * a != b
         * a < b
         * a > b
         * a <= b
         * a >= b
         */

        // Conditional statement
        System.out.println("Enter your age: ");
        int legalAge = z.nextInt();
        if (legalAge < 18)
            System.out.println("Not an Adult");
        else
            System.out.println("Adult");

        // Logical operators
        /*
         * && => TT
         * || => FT/TF
         * ! => negation of any value
         */
        int a = 30;
        int b = 40;

        if (a < 50 && b < 50) {
            System.out.println("AND Operator");
        }
        if (a < 50 || b < 80) {
            System.out.println("OR Operator");
        }

        // Loops print the numbers from 10 to 1 in decreasing order
        // For loop
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // While loop
        int i = 10;
        while (i >= 1) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();

        // Do-While loop
        int j = 10;
        do {
            System.out.print(j + " ");
            j--;
        } while (j >= 1);
        System.out.println();

        // Break & Continue statement
        int c = 0;
        while (true) {
            if (c == 3) {
                c++;
                continue; // it skips the particular part and run the loop further
            }
            System.out.print(c + " ");
            c++;
            if (c > 5) {
                break; // closes the loop if faced this condition
            }
        }
        System.out.println();

        // TRY CATCH exception handling
        int[] record = { 12, 23, 34 };
        try {
            System.out.println(record[5]);
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("Statement after handling the exception.");
    }
}
