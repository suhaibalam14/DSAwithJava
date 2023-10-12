package OOPs.ComapringObjects;

public class Main {

    public static void main(String[] args) {
        CompareObjects Rahul =new CompareObjects(15,95.56f);
        CompareObjects Mohit =new CompareObjects(10,93.6f);
        CompareObjects Parul =new CompareObjects(14,88.16f);
        CompareObjects Ankit =new CompareObjects(1,79.3f);

//        CompareObjects me = new CompareObjects(15);
//        CompareObjects you = me;
//
//        if (me==you)
//            System.out.println("worked");
//        else
//            System.out.println("didn't worked");

        if (Rahul.compareTo(Mohit) > 0){
            System.out.println("Rahul has higher marks");
        }

        System.out.println(Rahul);
    }
}
