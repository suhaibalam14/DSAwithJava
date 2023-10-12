package OOPs.AbstractDemo;

public class Main {
    //parent p = new parent();
    public static void main(String[] args) {
        parent father = new son(25);
        parent mom = new daughter(23);
        son rahul = new son(26);
        daughter rani = new daughter(15);
        System.out.println(rani.age);
        System.out.println("Age of Rahul is: "+rahul.age);
        System.out.println(father.age);
        System.out.println(mom.age);
        father.career();
        father.partner();
        mom.career();
        mom.partner();

        parent.abnornal();
        father.normal();
        mom.normal();

    }



}
