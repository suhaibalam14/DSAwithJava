package Classroom.practice;

public class Root {
    static int root(int x){
        if (x<2)
            return x;
        int root=1;
        for (int i = 1;  i*i<=x; i++) {
            if(i*i <= x)
                root=i;

        }
        return root;
    }

    public static void main(String[] args) {
        System.out.println(root(100000000));
    }
}
