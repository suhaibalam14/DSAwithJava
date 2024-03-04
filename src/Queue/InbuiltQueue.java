package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class InbuiltQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i <= 10; i++) {
            queue.add(i);
        }
        System.out.println(queue.isEmpty());
        queue.poll();
        System.out.println(queue.size());
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(queue.poll());
        }
    }
}
