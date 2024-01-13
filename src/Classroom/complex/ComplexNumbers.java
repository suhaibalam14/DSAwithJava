package Classroom.complex;

public class ComplexNumbers {
    private int real;
    private int imaginary;

    public ComplexNumbers(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }
    public void plus(ComplexNumbers n2){
        this.real += n2.real;
        this.imaginary += n2.imaginary;
    }
    public void multiply(ComplexNumbers other){
        int realPart= this.real * other.real - this.imaginary * other.imaginary;
        int imgPart= this.real * other.imaginary + this.imaginary * other.real;
        this.real = realPart;
        this.imaginary = imgPart;
    }
    public void print(){
        if(this.imaginary>0)
            System.out.println(this.real + " + i" + this.imaginary);
        else
            System.out.println(this.real + " - i" + Math.abs(this.imaginary));
    }
}
