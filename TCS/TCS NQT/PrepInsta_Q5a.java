import java.util.Scanner;

public class PrepInsta_Q5a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("No. of interior walls: ");
        int inte = sc.nextInt(); 
        System.out.print("No. of exterior walls: ");
        int exte = sc.nextInt(); 

        
        float[] wall1 = new float[inte]; 
        float[] wall2 = new float[exte]; 

        System.out.print("Enter the values for the interior walls: ");
        for (int i = 0; i < inte; i++) {
            wall1[i] = sc.nextFloat(); 
        }

        System.out.print("Enter the values for the exterior walls: ");
        for (int i = 0; i < exte; i++) {
            wall2[i] = sc.nextFloat(); 
        }

        float sum1 = 0;
        for (int i = 0; i < inte; i++) {
            sum1 += wall1[i];
        }

        float sum2 = 0;
        for (int i = 0; i < exte; i++) {
            sum2 += wall2[i];
        }

        System.out.println("Total cost: " + (sum1 * 18 + sum2 * 12)); 
        sc.close();
    }
}
