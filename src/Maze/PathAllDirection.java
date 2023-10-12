package Maze;

public class PathAllDirection {
    static void pathAllDirection(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length-1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c])
            return;
        maze[r][c] = false;

        if (r < maze.length - 1)
            pathAllDirection('D' + p, maze, r + 1, c);
        if (c < maze[0].length - 1)
            pathAllDirection('R' + p, maze, r, c + 1);
        if (r > 0)
            pathAllDirection('U' + p, maze, r - 1, c);
        if (c > 0)
            pathAllDirection('L' + p, maze, r, c - 1);

        maze[r][c] = true;
    }

    public static void main(String[] args) {
        boolean[][] maze = {{true, true, true},
                {true, true, true},
                {true, true, true}};
        pathAllDirection("", maze,0,0);
    }
}
