package Classroom.practice;

import java.util.Scanner;

public class Polynomial {
    int[] degreeCoefficient;

    public Polynomial(){
        degreeCoefficient = new int[5];
    }
    /* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
     *  then corresponding term with specified degree and value is added int the polynomial. If the degree
     *  is already present in the polynomial then previous coefficient is replaced by
     *  new coefficient value passed as function argument
     */
    public void setCoefficient(int degree, int coeff){
        if(degree < degreeCoefficient.length)
            this.degreeCoefficient[degree] = coeff;
        else{
            int[] temp = new int[degree + 1];
            System.arraycopy(degreeCoefficient, 0, temp, 0, degreeCoefficient.length);
            temp[degree] = coeff;
            degreeCoefficient = temp;
        }

    }

    // Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree.
    public void print(){
        for (int i = 0; i < degreeCoefficient.length; i++) {
            if(degreeCoefficient[i] != 0)
                System.out.println(degreeCoefficient[i] + "x" + i + " ");
        }
    }


    // Adds two polynomials and returns a new polynomial which has result
    public Polynomial add(Polynomial p){
        Polynomial ans = new Polynomial();
        int len1 = this.degreeCoefficient.length;
        int len2 = p.degreeCoefficient.length;

        int minLen = Math.min(len1, len2);
        int i = 0;
        while(i < minLen){
            ans.setCoefficient(i, this.degreeCoefficient[i] + p.degreeCoefficient[i]);
            i++;
        }
        while(i < len1){
            ans.setCoefficient(i, this.degreeCoefficient[i]);
            i++;
        }
        while(i < len2){
            ans.setCoefficient(i, p.degreeCoefficient[i]);
            i++;
        }
        return ans;
    }

    // Subtracts two polynomials and returns a new polynomial which has result
    public Polynomial subtract(Polynomial p){

        Polynomial ans = new Polynomial();
        int len1 = this.degreeCoefficient.length;
        int len2 = p.degreeCoefficient.length;

        int minLen = Math.min(len1, len2);
        int i = 0;
        while(i < minLen){
            ans.setCoefficient(i, this.degreeCoefficient[i] - p.degreeCoefficient[i]);
            i++;
        }
        while(i < len1){
            ans.setCoefficient(i, this.degreeCoefficient[i]);
            i++;
        }
        while(i < len2){
            ans.setCoefficient(i, -p.degreeCoefficient[i]);
            i++;
        }
        return ans;
    }

    // Multiply two polynomials and returns a new polynomial which has result
    public Polynomial multiply(Polynomial p){
        Polynomial ans = new Polynomial();

        for (int i = 0; i < this.degreeCoefficient.length; i++) {
            for (int j = 0; j < p.degreeCoefficient.length; j++) {
                int finalDegree = i+j;
                int finalCoefficient = this.degreeCoefficient[i] * p.degreeCoefficient[j];

                int oldCoefficient = 0;
                if(finalDegree < ans.degreeCoefficient.length){
                    oldCoefficient = ans.degreeCoefficient[finalDegree];
                }
                ans.setCoefficient(finalDegree, oldCoefficient + finalCoefficient);
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] degree1 = new int[n];
        for(int i = 0; i < n; i++){
            degree1[i] = s.nextInt();
        }
        int[] coeff1 = new int[n];
        for(int i = 0; i < n; i++){
            coeff1[i] = s.nextInt();
        }
        Polynomial first = new Polynomial();
        for(int i = 0; i < n; i++){
            first.setCoefficient(degree1[i],coeff1[i]);
        }
        n = s.nextInt();
        int[] degree2 = new int[n];
        for(int i = 0; i < n; i++){
            degree2[i] = s.nextInt();
        }
        int[] coeff2 = new int[n];
        for(int i = 0; i < n; i++){
            coeff2[i] = s.nextInt();
        }
        Polynomial second = new Polynomial();
        for(int i = 0; i < n; i++){
            second.setCoefficient(degree2[i],coeff2[i]);
        }
        int choice = s.nextInt();
        Polynomial result;
        switch(choice){
            // Add
            case 1:
                result = first.add(second);
                result.print();
                break;
            // Subtract
            case 2 :
                result = first.subtract(second);
                result.print();
                break;
            // Multiply
            case 3 :
                result = first.multiply(second);
                result.print();
                break;
        }

    }
}