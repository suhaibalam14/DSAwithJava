package OOPs.DefaultMethod;

public interface DefaultMethod {

    static void white(){
        System.out.println("Hi, I'm white in colour");
    }

    default void black(){
        System.out.println("Hi, I'm black in colour and i'm the default one ");

    }

}
