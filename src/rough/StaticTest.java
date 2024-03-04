package rough;

public class StaticTest {
    public static void main(String[] args) {
        fun();
        StaticTest tst = new StaticTest();
        tst.bun();
    }

    public static void fun(){
        System.out.println("Im a static method.");
        StaticTest tst = new StaticTest();
        tst.bun();
    }
    public void bun(){
        System.out.println("Im a non static method.");
        fun();
        fun1();

    }
    public static void fun1(){
        System.out.println("Another static method");
        fun();
    }
    public void bun1(){
        System.out.println("Another non static method");
        bun();
    }
}
