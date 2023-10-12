package OOPs.Interface;

public class carBrakes implements brake{
    @Override
    public void applyBreak() {
        System.out.println("Breaks applied normally");
    }
}
