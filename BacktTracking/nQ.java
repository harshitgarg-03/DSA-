public class nQ {
    public static void printChessBoard(char chessBoard[][]) {
        System.out.println("-------------------Print-------------------------");
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static boolean isSafe(char chessBoard[][], int row, int col) {

        // vertical
        for (int i = 0; i < chessBoard.length; i++) {
            if (chessBoard[i][col] == 'Q') {
                return false;
            }
        }

        // horizontal
        // for (int i = 0; i < chessBoard.length; i++) {
        //     if (chessBoard[row][i] == 'Q') {
        //         return false;
        //     }
        // }

        // Diagonal left UP
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (chessBoard[i][j] == 'Q') {
                return false;
            }
        }

        // Diagonal right UP
        for (int i = row, j = col; i >= 0 && j < chessBoard.length; i--, j++) {
            if (chessBoard[i][j] == 'Q') {
                return false;
            }
        }
        // Diagonal right Down
        // for (int i = row, j = col; i < chessBoard.length && j < chessBoard.length; i++, j++) {
        //     if (chessBoard[i][j] == 'Q') {
        //         return false;
        //     }
        // }

        // Diagonal left Down
        // for (int i = row, j = col; i < chessBoard.length && j >= 0; i++, j--) {
        //     if (chessBoard[i][j] == 'Q') {
        //         return false;
        //     }
        // }

        return true;
    }

    public static void placedQueens(char chessBoard[][], int row) {
        if (row == chessBoard.length) {
            printChessBoard(chessBoard);
            return;
        }

        for (int i = 0; i < chessBoard.length; i++) {
            if (isSafe(chessBoard, row, i)) {
                chessBoard[row][i] = 'Q';
                placedQueens(chessBoard, row + 1);
                chessBoard[row][i] = 'X';
            }
        }
    }

    public static void main(String args[]) {
        int n = 4;
        char chessBoard[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chessBoard[i][j] = 'X';
            }
        }
        placedQueens(chessBoard, 0);
    }
}