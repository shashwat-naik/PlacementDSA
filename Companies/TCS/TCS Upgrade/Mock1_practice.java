import java.util.Scanner;

public class Mock1_practice {
    // Q1 Print hello word w/o using ;.

    /* public static void main(String[] args) {
        if (System.out.printf("Hello World") == null) {}
    } */

    // Q2 Convert decimal to binary

    public static void convertBinary(int n){
        if(n>0){
            convertBinary(n/2);
            System.out.print(n%2);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        convertBinary(n);
        sc.close();
    }


}
