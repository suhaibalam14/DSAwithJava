package OOPs.inheritance;

public class Main {
    public static void main(String[] args) {

        //a Box type reference variable is pointing to an object invoking Box type constructor
        //hence, no inheritance used
//        Box box = new Box();
//        System.out.println(box.length);
//        System.out.println(box.height);
//        System.out.println(box.width);

        //it's a parent class, so it does not have access to the child class member
        //Box box1 = new Box(1,1,1,2);

//        Box box2 = new BoxWeight(1,2,3,50);
//        System.out.println(box2.length);
//        System.out.println(box2.height);
//        System.out.println(box2.width);

        //we can't access child class members via parent class reference variable
       // System.out.println(box2.weight);

        //it is giving us an error because parent class is not aware of the existence of child class
        //BoxWeight box3 = new Box();

//        BoxWeight box4 = new BoxWeight();
//        System.out.println(box4.length);
//        System.out.println(box4.height);
//        System.out.println(box4.width);
//        System.out.println(box4.weight);
//
        BoxWeight box5 = new BoxWeight(2,2,4,80);
//        System.out.println(box5.length);
//        System.out.println(box5.height);
//        System.out.println(box5.width);
//        System.out.println(box5.weight);



//        BoxColor box6 = new BoxColor();
//        System.out.println(box6.length);
//        System.out.println(box6.height);
//        System.out.println(box6.width);
//        System.out.println(box6.width);
//        System.out.println(box6.color);
//        System.out.println();


//        BoxColor box8 = new BoxColor();
//        System.out.println(box8.length);
//        System.out.println(box8.height);
//        System.out.println(box8.width);
//        System.out.println(box8.weight);
//        System.out.println(box8.color);


        BoxColor box7 = new BoxColor (2,4,6,40,"red");
        System.out.println(box7.length);
        System.out.println(box7.height);
        System.out.println(box7.width);
        System.out.println(box7.weight);
        System.out.println(box7.color);
        System.out.println();
        System.out.println();

        BoxColor box9 = new BoxColor(box7);
        System.out.println(box9.length);
        System.out.println(box9.height);
        System.out.println(box9.width);
        System.out.println(box9.weight);
        System.out.println(box9.color);



    }





}
