package backtracking;

/**
 * You have an N by N board. Write a function that, given N, returns the number of possible arrangements of the board where N queens can be placed on the board without threatening each other, i.e. no two queens share the same row, column, or diagonal.
 */
public class QueenProblem {


    void arrangeQueen(int n) {

        boolean[][] occupiedMatrix = new boolean[n][n];

        arrangeQueenHelper(occupiedMatrix, 0, n);
    }

    private void arrangeQueenHelper(boolean[][] occupiedMatrix, int col, int n) {
        if (col >= n) {
            addToAnswer(occupiedMatrix, n);
        }

        for (int row = 0; row < n; row++) {
            if (isSafe(occupiedMatrix, col, row)) {
                occupiedMatrix[row][col] = true;
                arrangeQueenHelper(occupiedMatrix, col + 1, n);
                occupiedMatrix[row][col] = false;
            }
        }


    }

    private boolean isSafe(boolean[][] occupiedMatrix, int col, int row) {

        int n = occupiedMatrix.length;
        for (int c = 0; c < col; c++) {   // check left side of the column
            if (occupiedMatrix[row][c] == true)
                return false;
        }
        int r = row - 1;
        int c = col - 1;
        while (r >= 0 && c >= 0) { // check upper diagonal
            if (occupiedMatrix[r][c])
                return false;
            r--;
            c--;
        }
        r = row + 1;
        c = col - 1;
        while (r < n && c >= 0) {
            if (occupiedMatrix[r][c]) // lower diagonal
                return false;
            r++;
            c--;
        }
        return true;
    }


    public void addToAnswer(boolean[][] occupiedMatrix, int n) {
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (occupiedMatrix[i][j]) {
                    System.out.print((j + 1) + " ");
                }
            }
        }
        System.out.print("]");
    }

    public static void main(String args[]) {

        QueenProblem qp = new QueenProblem();
        qp.arrangeQueen(4);
    }


}
