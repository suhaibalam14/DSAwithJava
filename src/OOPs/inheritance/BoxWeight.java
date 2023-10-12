package OOPs.inheritance;

public class BoxWeight extends Box {
    int weight;

    public BoxWeight(int length, int height, int width, int weight) {
        super(length, height, width);
        this.weight = weight;
    }


    public BoxWeight(int weight) {
        this.weight = weight;
    }

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(Box other, int weight) {
        super(other);
        this.weight = weight;
    }

    public BoxWeight (BoxColor other){
        super(other);
        this.weight = other.weight;
    }

}


