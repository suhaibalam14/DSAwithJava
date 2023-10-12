package OOPs;



public class BasicOOPs {

    public static void main(String[] args) {
      //  Student[] student1 = new Student[5];

//        Student kunal = new Student();
//        kunal.rollNo = 23;
//        kunal.name = "Kunal Kushwaha";
//        kunal.marks = 90.5f;
//        System.out.println(kunal.rollNo);
//        System.out.println(kunal.name);
//        System.out.println(kunal.marks);
//
//        Student student2 = new Student(25,"Suhaib Alam", 85.5f);
//        System.out.println(student2.rollNo);
//        System.out.println(student2.name);
//        System.out.println(student2.marks);

//        Student student3 = new Student();
//        System.out.println(student3.rollNo);
//        System.out.println(student3.name);
//        System.out.println(student3.marks);
//
//        Student student4 = new Student(30, "Suhaib Alam", 94.6f);
//        System.out.println(student4.rollNo);
//        System.out.println(student4.name);
//        System.out.println(student4.marks);


//        Student pappu = new Student(1, "Pappu doodhwala", 52);
//        Student kallu = pappu;
//        System.out.println(kallu.rollNo);
//        System.out.println(kallu.name);
//        System.out.println(kallu.marks);
//        System.out.println();
//
//        pappu.changeRollNo(25);
//        System.out.println(pappu.rollNo);

//        Student shonty = new Student(pappu);
//        System.out.println(shonty.rollNo);
//        System.out.println(shonty.name);
//        System.out.println(shonty.marks);
//
//
        Student neelu = new Student();
        System.out.println(neelu.rollNo);
        System.out.println(neelu.name);
        System.out.println(neelu.marks);
    }
}

class Student{
    int rollNo;
    String name;
    float marks ;

     Student(int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    Student(String name, float marks) {

        this.name = name;
        this.marks = marks;
    }

     Student (Student any){
        this.rollNo = any.rollNo;
        this.name = any.name;
        this.marks= any.marks;
    }

     Student() {
        this(25,"Salman Khan", 95);
    }

//        Student(){
//         this.rollNo = 26;
//         this.name = "Pappu Chaiwala";
//         this.marks = 67;
//        }
    void changeRollNo( int n){
         this.rollNo=n;
    }

}