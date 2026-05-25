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

    public static void placedQueens(char chessBoard[][], int row) {
        if (row == chessBoard.length) {
            return;
        }

        for (int i = 0; i < chessBoard.length; i++) {
            chessBoard[row][i] = 'Q';
            printChessBoard(chessBoard);
            chessBoard[row][i] = 'X';
        }
        placedQueens(chessBoard, row + 1);
    }

    public static void main(String args[]) {
        int n = 3;
        char chessBoard[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chessBoard[i][j] = 'X';
            }
        }
        placedQueens(chessBoard, 0);
    }
}