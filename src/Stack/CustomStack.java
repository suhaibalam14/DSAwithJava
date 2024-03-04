package Stack;

public class CustomStack {
     protected int[] data;
     private static final int DEFAULT_SIZE  = 10;
     int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data = new int[size];
    }
    public boolean push(int item){
        if (isFull()){
            System.out.println("Cannot be pushed stack is full");
            return false;
        }
        data[++ptr] = item;
        return true;
    }
    public int pop() throws StackEmptyException{
        if (isEmpty()){
            throw new StackEmptyException("Cannot pop, stack is empty");
        }
        return data[ptr--];
    }
    public int peek() throws StackEmptyException {
        if (isEmpty()){
            throw new StackEmptyException("Cannot peek, stack is empty");
        }
        return data[ptr];
    }

    protected boolean isFull() {
        return (ptr == data.length - 1);
    }
    public boolean isEmpty(){
        return ptr == -1;
    }
    public int size(){
        return ptr+1;
    }

    public void display(){

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "^");
        }
    }
}
