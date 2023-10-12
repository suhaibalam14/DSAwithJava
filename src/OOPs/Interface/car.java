package OOPs.Interface;

public class car implements engine, brake, mediaPlayer{
    @Override
    public void applyBreak() {
        System.out.println("I apply break like a super car");
    }

    @Override
    public void start() {
        System.out.println("I start like a super car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like a super car");
    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate like a super car");
    }
}
