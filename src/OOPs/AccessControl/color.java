package OOPs.AccessControl;

public class color {
    public int totalColor;
    String quality;
    boolean isleft;

    public color() {
    }

     void fun(){
        System.out.println("hello this is fun");
    }
    public color(int totalColor, String quality, boolean isleft) {
        this.totalColor = totalColor;
        this.quality = quality;
        this.isleft = isleft;
    }
}
