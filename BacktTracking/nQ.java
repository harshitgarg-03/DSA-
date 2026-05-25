public class nQ {
    public static void printChessBoard(char chessBoard[][]) {
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                System.out.print(chessBoard[i][j] + " ");

            }
            System.out.println("");
        }
    }

    public static void main(String args[]) {
        int n = 4;
        char chessBoard[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chessBoard[i][j] = '.';
            }
        }

        printChessBoard(chessBoard);
    }
}