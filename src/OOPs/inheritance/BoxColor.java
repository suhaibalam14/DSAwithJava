package OOPs.inheritance;

public class BoxColor extends BoxWeight {
    String color;

    public BoxColor(int length, int height, int width, int weight, String color) {
        super(length, height, width, weight);
        this.color = color;
    }

    public BoxColor(Box other, int weight, String color) {
        super(other, weight);
        this.color = color;
    }

    public BoxColor(int weight, String color) {
        super(weight);
        this.color = color;
    }

    public BoxColor(String color) {
        this.color = color;
    }

    public BoxColor(){
        this.color = "white";
    }

    public BoxColor(BoxColor other){
        super(other);
        this.color = other.color;
    }

}
