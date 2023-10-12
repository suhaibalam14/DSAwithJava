package OOPs.ComapringObjects;

public class CompareObjects implements Comparable<CompareObjects> {
    int rollNo;
    float marks;

    public CompareObjects(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "CompareObjects{\n" +
                "rollNo=" + rollNo +
                ", marks=" + marks +
                '}';
    }

    public CompareObjects(int rollNo){
        this.rollNo = rollNo;
    }



    @Override
    public int compareTo(CompareObjects o) {
        return (int) (this.marks - o.marks);
    }
}
