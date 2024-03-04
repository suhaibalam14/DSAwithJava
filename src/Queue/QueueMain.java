package Queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
//        CircularQueue queue = new CircularQueue(20);
//        queue.insert(12);
//        queue.insert(12);
//        queue.insert(12);
//        queue.insert(12);
//        queue.insert(12);
//        queue.insert(12);
//        queue.insert(12);
//        queue.display();
//        queue.isEmpty();
//        queue.isEmpty();

        DynamicQueue q = new DynamicQueue(25);
        for (int i = 1; i <= 50; i++) {
            q.insert(i);
        }
        q.display();
    }
}
