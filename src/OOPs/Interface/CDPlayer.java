package OOPs.Interface;

public class CDPlayer implements mediaPlayer{


    @Override
    public void start() {
        System.out.println("Player Started");
    }

    @Override
    public void stop() {
        System.out.println("Player stopped");

    }
}
