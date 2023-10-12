package OOPs.AbstractDemo;

public abstract class parent {
    int age;

    parent(int age){
        this.age = age;
    }
    abstract void career();
    abstract void partner();

    void normal(){
        System.out.println("Hello i'm a normal method");
    }

    static void abnornal(){
        System.out.println("Hello i'm static method");

    }
}
