package OOPs.generics;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private int DEFAULT_SIZE = 5;
    private int size = 0;

    public CustomArrayList() {
    this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {

        int[] temp = new int[data.length*2];
        for(int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    private boolean isFull() {
        return size == data.length;
    }

    public int remove(){
        return data[--size];
    }

    public void set(int index, int value){
        data[index] = value;
    }
    public int size(){
        return size;
    }

    public int get(int index) {
        return data[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(data) ;
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        for (int i = 0; i < 20; i++) {
            list.add(i*2);
        }
        System.out.println(list);
        list.set(5, 256);
        System.out.println(list);
        System.out.println(list.get(5));
    }


}
