package OOPs.AbstractDemo;

public class daughter extends parent{
    daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I want to become a teacher");
    }


    @Override
    void partner() {
        System.out.println("I love Cap");



    }
}
