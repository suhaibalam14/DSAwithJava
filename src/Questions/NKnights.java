package Questions;

public class NKnights {
    static void nknights(boolean[][] board, int row, int col, int knights) {
        if (knights == 0) {
            display(board);
            System.out.println();
            return;
        }
        if (row == board.length - 1 && col == board.length - 1) {
            return;
        }
        if (col == board.length) {
            nknights(board, row + 1, 0, knights);
            return;
        }

        if (isSafe(board, row, col)) {
            board[row][col] = true;
            nknights(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }

        nknights(board, row, col + 1, knights);
    }

    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element)
                    System.out.print("K  ");
                else
                    System.out.print("*  ");
            }
            System.out.println();
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if (isValid(board, row - 1, col - 2))
            return  !board[row - 1][col - 2];

        if (isValid(board, row - 1, col + 2))
            return  !board[row - 1][col + 2];

        if (isValid(board, row - 2, col + 1))
            return  !board[row - 2][col + 1];

        if (isValid(board, row - 2, col - 1))
            return !board[row - 2][col - 1];

        return true;
    }

    private static boolean isValid(boolean[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board.length;
    }

    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        nknights(board, 0, 0, 4);
    }
}