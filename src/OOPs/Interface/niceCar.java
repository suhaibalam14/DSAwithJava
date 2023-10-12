package OOPs.Interface;

public class niceCar {
    private engine engine;
    private mediaPlayer player;

    private brake normalBrakes;


    public niceCar() {
        engine = new powerEngine();
        player = new CDPlayer();
        normalBrakes = new carBrakes();
    }


    public niceCar(engine engine) {
        this.engine = engine;

    }

    public void engineStart() {
        engine.start();
    }

    public void engineAccelerate() {
        engine.accelerate();
    }

    public void applyBrake() {
        normalBrakes.applyBreak();
    }

    public void engineStop() {
        engine.stop();
    }

    public void playerStart() {
        player.start();
    }

    public void playerStop() {
        player.stop();
    }

    public void upgradeEngine(){
        this.engine = new electricEngine();
        System.out.println("Engine upgraded to electric engine");
    }
}
