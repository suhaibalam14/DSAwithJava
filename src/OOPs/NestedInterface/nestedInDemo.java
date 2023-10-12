package OOPs.NestedInterface;

public class nestedInDemo {
    public interface engine{
        void powerEngine();
    }

}

class testInDemo implements nestedInDemo.engine{


    @Override
    public void powerEngine() {
        System.out.println("I'm a power engine");
    }
}

class Main{
    public static void main(String[] args) {
        testInDemo test = new testInDemo();
        test.powerEngine();
    }


}