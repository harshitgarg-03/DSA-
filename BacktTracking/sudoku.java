public class sudoku {

    public static void printsudoku(int sudoku[][]) {
        System.out.println("--------------------SUDOKU SOLVING WAYS---------------------");
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {

        // vertical
        for (int i = 0; i < sudoku.length; i++) {
            if (sudoku[i][col] == digit)
                return false;
        }

        // horizontal
        for (int i = 0; i < sudoku.length; i++) {
            if (sudoku[row][i] == digit)
                return false;
        }

        // grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean SudokuSolver(int sudoku[][], int row, int col) {

    if (row == sudoku.length) {
        printsudoku(sudoku);
        return true;
    }

    int nextrow = row;
    int nextcol = col + 1;

    if (col + 1 == sudoku.length) {
        nextrow = row + 1;
        nextcol = 0;
    }

    if (sudoku[row][col] != 0) {
        return SudokuSolver(sudoku, nextrow, nextcol);
    }

    for (int j = 1; j <= 9; j++) {

        if (isSafe(sudoku, row, col, j)) {

            sudoku[row][col] = j;

            // recurse
            if (SudokuSolver(sudoku, nextrow, nextcol)) {
                return true;
            }

            // backtracking
            sudoku[row][col] = 0;
        }
    }

    return false;
}
        public static void main(String args[]) {
        int sudoku[][] = {
                { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
        };
        SudokuSolver(sudoku, 0, 0);
    }
}