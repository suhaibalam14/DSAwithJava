package Maze;

public class PathObstacle {
    static void pathObstacle(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length-1 && c == maze[0].length-1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c])
            return;
        if (r < maze.length - 1)
            pathObstacle('V' + p, maze, r + 1, c);
        if (c < maze[0].length - 1)
            pathObstacle('H' + p, maze, r, c + 1);
    }

    public static void main(String[] args) {
        boolean[][] maze = {{true, true, true},
                {true, false, true},
                {true, true, true}};
        pathObstacle("", maze, 0, 0);
    }
}
