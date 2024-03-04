package Queue;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int capacity) {
        this.data = new int[capacity];
    }
    public boolean insert(int item) throws QueueFullException{
        if(isFull()){
            throw new QueueFullException("Cannot insert, queue is full");
        }
        data[end++] = item;
        return true;
    }
    public int remove() throws QueueEmptyException{
        if (isEmpty())
            throw new QueueEmptyException("Cannot remove, there is no item in queue");
        int removed = data[0];
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    public int front() throws QueueEmptyException{
        if(isEmpty())
            throw new QueueEmptyException("Cannot find front, queue is empty.");
        return data[0];
    }
    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + "<-");
        }
        System.out.print("end");
    }
    private boolean isFull() {
        return end == data.length;
    }
    private boolean isEmpty(){
        return end == 0;
    }
}
