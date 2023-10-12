public class IthBit {
    public static void main(String[] args) {
        System.out.println(ithbit(182, 5));
    }

    private static int ithbit(int n, int bit) {
        return (n & (1<<bit-1))>>bit-1;
    }
}
