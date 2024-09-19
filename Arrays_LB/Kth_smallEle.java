import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_smallEle {
    static void kSmallest(int[] arr, int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if (pq.peek() > arr[i]) {
                pq.poll();
                pq.add(arr[i]);
            }
        }

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45 };
        int n = arr.length;
        int k = 6;

        System.out.println(k + "th smallest Kth element is ");

        kSmallest(arr, n, k);
    }
}
