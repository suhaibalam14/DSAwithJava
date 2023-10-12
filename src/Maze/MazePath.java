package Maze;

public class MazePath {


    //Path including horizontal and vertical motion
    static void mazePath( String p, int r , int c){
        if (r==1&&c==1){
            System.out.println(p);
            return;
        }
        if (r>1)
            mazePath('V'+ p, r-1,c);


        if (c>1)
            mazePath('H'+ p, r,c-1);
    }


    //Path including horizontal, vertical and diagonal motion
    static void mazePathDiag( String p, int r , int c){
        if (r==1&&c==1){
            System.out.println(p);
            return;
        }
        if (r>1)
            mazePathDiag('V'+ p, r-1,c);
        if (r>1 && c>1)
            mazePathDiag('D'+ p, r-1,c-1);
        if (c>1)
            mazePathDiag('H'+ p, r,c-1);
    }

    public static void main(String[] args) {
     //   mazePath("", 3,3);
        mazePathDiag("", 3,3);
    }

}
