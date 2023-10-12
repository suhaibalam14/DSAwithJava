package OOPs.generics;

import java.util.Arrays;

public class CustomGenericArrayList<T> {
    private Object[] data;
    private int size = 0;

    public CustomGenericArrayList() {
        int DEFAULT_SIZE = 5;
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {

        Object[] temp = new Object[data.length*2];
        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        return (T) (data[--size]);
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        return (T) data[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    public static void main(String[] args) {
        CustomGenericArrayList list = new CustomGenericArrayList();
//        for (int i = 0; i < 27; i++) {
//            list.add(i * 2);
//        }
//        System.out.println(list);
        list.add("hello");
        list.add(123456);
        list.add('l');
        list.add(1323.154198465);
        list.add(true);
        System.out.println(list);
    }
}