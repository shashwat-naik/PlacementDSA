import java.util.Arrays;
import java.util.Scanner;

public class Int_Occurrance {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3 };
        Arrays.sort(arr);
        int count;
        for (int i = 0; i < arr.length; i += count) {
            count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
                else
                    break;
            }
            System.out.println(arr[i] + " occurs " + count + " times.");
        }   
    }
}
 

// .........................................................................................

/* import java.util.HashMap;

public class Int_Occurrance {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3 };
        HashMap<Integer, Integer> occur = new HashMap<>();

        for (int num : arr) {
            occur.put(num, occur.getOrDefault(num, 0) + 1);
        }

        for (int key : occur.keySet()) {
            System.out.println(key + " occurs " + occur.get(key) + " times.");
        }
    }
} */