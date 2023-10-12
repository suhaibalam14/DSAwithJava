package OOPs.ExceptionHandling;

public class exceptionHandling {
    public static void main(String[] args) {
        try {
            int a = 5/0;

//            String name = "Rahul";
//            if (name.equals("Rahl"))
//                throw new MyException("Hey! Yeah it worked and it just throw an exception");

        }
        //catch (MyException m){
//            System.out.println(m.getMessage());
//        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
       catch (Exception e){
            System.out.println("Other Exception");
        }finally {
            System.out.println("This block will always be executed ");
        }
    }

    static int divide (int a, int b) throws ArithmeticException{
        if(b==0)
            throw new ArithmeticException("Please don't divide by zero");
        return a/b;
    }
}
