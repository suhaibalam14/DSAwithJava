package OOPs.AbstractDemo;

public class son extends parent
{
    son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I want to be a developer");
    }

    @Override
    void partner() {
        System.out.println("I love IronMan");

    }
}
