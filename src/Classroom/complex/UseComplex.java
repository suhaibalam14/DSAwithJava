package Classroom.complex;

public class UseComplex {
    public static void main(String[] args) {
        ComplexNumbers n1 = new ComplexNumbers(2,-9);
        ComplexNumbers n2 = new ComplexNumbers(3,-7);
        n1.print();
        n1.plus(n2);
        n1.print();
//          n1.print();
//          n1.multiply(n2);
//          n1.print();

    }

}
