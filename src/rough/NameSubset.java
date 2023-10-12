package rough;

public class NameSubset {
    static void nameSubset(String processed, String name){
        if (name.isEmpty()) {
            System.out.println(processed);
            return;
        }
         nameSubset(processed, name.substring(1));
         nameSubset(name.charAt(0)  + processed, name.substring(1));
    }

    public static void main(String[] args) {
        nameSubset("", "suhaib");
    }
}
