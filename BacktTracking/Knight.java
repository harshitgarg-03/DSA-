public class Knight {

    public static void SolveKnight(int grid[][], int i, int j, int count) {
        if (count == grid.length * grid.length) {
            System.out.println("True");
            return;
        }

        // Checking Availability

        // Upper Conditions

        if(grid[i-2][j+1] == count){
            i = i-2; 
            j = j+1;
            SolveKnight(grid, i, j, count+1);
        }

        if(grid[i-2][j-1] == count){
            i = i-2; 
            j = j-1;
            SolveKnight(grid, i, j, count+1);
        }

        // Down

        if(grid[i+2][j+1] == count){
            i = i+2; 
            j = j+1;
            SolveKnight(grid, i, j, count+1);
        }

        if(grid[i+2][j-1] == count){
            i = i+2; 
            j = j-1;
            SolveKnight(grid, i, j, count+1);
        }

        // Left
        if(grid[i+1][j-2] == count){
            i = i+1; 
            j = j-2;
            SolveKnight(grid, i, j, count+1);
        }
        if(grid[i-1][j-2] == count){
            i = i-1; 
            j = j-2;
            SolveKnight(grid, i, j, count+1);
        }

        // Right

        if(grid[i-1][j+2] == count){
            i = i-1; 
            j = j+2;
            SolveKnight(grid, i, j, count+1);
        }
        if(grid[i+1][j+2] == count){
            i = i+1; 
            j = j+2;
            SolveKnight(grid, i, j, count+1);
        }

        else{
            System.out.println("False ");
            return;
        }
    }

    public static void main(String args[]) {
        int grid[][] = { { 0, 11, 16, 5, 20 }, { 17, 4, 19, 10, 15 }, { 12, 1, 8, 21, 6 }, { 3, 18, 23, 14, 9 },
                { 24, 13, 2, 7, 22 } };
        
        if(grid[0][0] != 0) {
            System.out.println("false ");
            return;
        }
        int count = 1;
        SolveKnight(grid, 0, 0, count);
    }

}