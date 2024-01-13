package OOPs.inheritance;

public class Box {
    int length;
    int height;
    int width;

   public Box(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }


    public Box() {
        this.length = -1;
        this.height = -1;
        this.width = -1;
    }

    public Box(Box other) {
        this.length = other.length;
        this.height = other.height;
        this.width = other.width;
    }

}
