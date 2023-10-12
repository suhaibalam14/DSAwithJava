package Questions;

public class SudokuSolver {
    static boolean solve(int[][] board) {
        int row = -1;
        int col = -1;
        boolean noEmpty = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    noEmpty = false;
                    break;
                }
            }
            if (!noEmpty) {
                break;
            }
        }
        if (noEmpty) {
            return true;
        }
        for (int n = 1; n <= 9; n++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = n;
                if (solve(board)) {
                    return true;
                } else {
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }
    static boolean isSafe(int[][] board, int row, int col, int number) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == number) {
                return false;
            }
        }
        for (int[] ints : board) {
            if (ints[col] == number) {
                return false;
            }
        }
        int sqrt = (int) (Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == number) {
                    return false;
                }
            }
        }
        return true;
    }
    static void display(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + "  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] board = {
                {0, 9, 0, 0, 0, 0, 8, 0, 0},
                {2, 0, 0, 7, 0, 0, 0, 0, 0},
                {0, 0, 0, 5, 0, 0, 0, 0, 0},
                {6, 0, 0, 0, 0, 0, 0, 7, 5},
                {0, 3, 0, 0, 8, 0, 0, 0, 0},
                {0, 0, 0, 0, 9, 0, 0, 0, 0},
                {7, 0, 5, 0, 0, 0, 0, 0, 6},
                {0, 0, 0, 0, 0, 0, 3, 8, 0},
                {0, 0, 0, 4, 0, 0, 0, 0, 0}
        };
        if (solve(board)) {
            display(board);
            System.out.println("Sudoku is solved \n There may be some other way to solve this piece of sudoku and this is what one of the solution is \n Alright!");
        } else {
            System.out.println("sudoku cannot be solved");
        }
    }
}
