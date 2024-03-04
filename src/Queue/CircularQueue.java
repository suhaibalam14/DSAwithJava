package Queue;
class CircularQueue {
    protected int[] data;
    protected int front = 0;
    protected int rear = 0;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CircularQueue(int capacity) {
        this.data = new int[capacity];
    }

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[rear++] = item;
        rear %= data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty())
            throw new Exception("Cannot remove, queue is already empty.");
        int val = data[front++];
        front %= data.length;
        size--;
        return val;
    }
    public int front() throws Exception{
        if (isEmpty())
            throw new Exception("Cannot find front, queue is already empty.");
        return data[front];
    }
    public void display() throws Exception {
        if (isEmpty())
            throw new Exception("Cannot display anything, queue is already empty.");
        int i = front;
        do {
            System.out.print(data[i] + "<-");
            i++;
            i %= data.length;
        } while (i != rear);
        System.out.print("End");
    }

    public static void main(String[] args) throws Exception{
        CircularQueue queue = new CircularQueue();
        queue.insert(10);
        queue.display();

    }
}
