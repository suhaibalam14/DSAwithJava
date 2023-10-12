package Maze;

public class Path {

    //Two directional function
    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1)
            path('D' + p, r - 1, c);
        if (c > 1)
            path('R' + p, r, c - 1);
    }

    //If moved including diagonal
    static void pathDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1 && c>1)
            pathDiagonal('D' + p, r - 1, c-1);

        if (r > 1)
            pathDiagonal('V' + p, r - 1, c);
        if (c > 1)
            pathDiagonal('H' + p, r, c - 1);
    }

    //

    public static void main(String[] args) {
       // path("",3,3);
        pathDiagonal("",3,3);
    }
}
