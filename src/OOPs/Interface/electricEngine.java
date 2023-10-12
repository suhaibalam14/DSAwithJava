package OOPs.Interface;

public class electricEngine implements engine{
    @Override
    public void start() {
        System.out.println("I start like an electric engine");
    }

    @Override
    public void stop() {
        System.out.println("I stop like an electric engine");
    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate like an electric engine");
    }
}
