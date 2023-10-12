package OOPs.Interface;

public class powerEngine implements engine{
    @Override
    public void start() {
        System.out.println("I start like a Power engine");
    }

    @Override
    public void stop() {
        System.out.println("I stop like a Power engine");
    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate like a Power engine");
    }
}
