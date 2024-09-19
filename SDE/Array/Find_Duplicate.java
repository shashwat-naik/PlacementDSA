/* 
 * Brute Approach: Sorting thr array and traversing through the array, the point at which the data is repeated, thats the output.
 * Optimal Approach I: HashSet method, counting the frequency array with all being zero, and the time where the frequency for one value is more than 1 is the output O(n) O(n)
 * Optimal Approach II: Tortoise method, Linkedlist circle method.  O(n) O(1)
 Below is explain with the hashset aswell as the tortoise method 
 */

import java.util.HashSet;
import java.util.Set;

public class Find_Duplicate {
    public static int duplicateI(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (!set.contains(i))
                set.add(i);
            else
                return i;
        }
        return -1;
    }

    public static int duplicateII(int[] arr) {
        int slow = arr[0];
        int fast = arr[0];

        do {
            slow = arr[slow];
            fast = arr[arr[fast]]; // fast pointer is moved 2 steps whereas slow one is moved 1 step
        } while (slow != fast);

        fast = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 4, 2, 2 };
        int ansI = duplicateI(arr);
        int ansII = duplicateII(arr);
        System.out.println("Duplicate number: " + ansI);
        System.out.println("Duplicate number: " + ansII);
    }
}
