public class Spiral_Matrix {
    public static void main(String[] args) {
        int matr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {11, 12, 13}};

        int m = matr.length-1;
        int n = matr[0].length-1;

        int row = 0;
        int col = 0;

        // right
        for(int i = col; i <= n; i++){
            System.out.print(matr[row][i] + " ");
        }
        row++;
        // down
        for(int i = row; i <= m; i++){
            System.out.print(matr[i][n] + " ");
        }
        n--;
        // left
        for(int i = n; i >= col; i--){
            System.out.print(matr[m][i] + " ");
        }
        m--;
        // up
        for(int i = m; i >= row; i--){
            System.out.print(matr[i][col] + " ");
        }
        col++;

    }
}
