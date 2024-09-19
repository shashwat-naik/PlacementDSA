/* Priority queue is the concept based on heap. In java it follows minHeap as default  */

import java.util.Collections;
import java.util.PriorityQueue;

public class Pri_Queue {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // // In order to change it into maxHeap.
        pq.add(5);
        pq.add(6);
        pq.add(7);

        System.out.println(pq.size());

        while (!pq.isEmpty()) {
            System.out.print(pq.peek());
            pq.poll();
        }
    }
}
