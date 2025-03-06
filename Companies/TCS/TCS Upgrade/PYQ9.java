import java.util.Arrays;

public class PYQ9 {
    // Q1 Minimum cost to move the chips
    // public static void main(String[] args) {
    // int[] position = { 1, 2, 3 };
    // int even = 0, odd = 0;
    // for (int i = 0; i < position.length; i++) {
    // if (position[i] % 2 == 0)
    // even++;
    // else
    // odd++;
    // }
    // int ans = Math.min(even, odd);
    // System.out.println(ans);

    // }

    // Q2 Total number of Common factors of two integers
    // public static void main(String[] args) {
    //     int a = 12, b = 6;
    //     int lower = Math.min(a, b);
    //     int count = 0;
    //     for (int i = 1; i < lower; i++) {
    //         if (a % i == 0 && b % i == 0) {
    //             count++;
    //             System.out.print(i + " ");
    //         }
    //     }
    //     System.out.println("\nTotal number of common factors are: " + count);
    // }

    // Q3*** Reducing dishes
    public static int maxSatisfaction(int[] arr){
        Arrays.sort(arr);
        int maxVal = 0, prefixSum = 0, total = 0;
        
        for (int i = arr.length - 1; i >= 0; i--) {
            prefixSum += arr[i];  
            if (prefixSum + total > total) {
                total += prefixSum;
                maxVal = total;
            } else {
                break;  
            }
        }
        return maxVal;
    }
    public static void main(String[] args) {
        int[] arr = { -1, -8, 0, 5, -9 };
        System.out.println(maxSatisfaction(arr));
    }
}
 