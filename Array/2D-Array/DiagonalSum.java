import java.util.*;

public class DiagonalSum {

    public static void DiagonalAdd(int marks[][]) {
        int DiaSum = 0;
        // To calculate primary diagonal
        int row = 0;
        int col = 0;

        for(int i = 0; i < marks.length; i++){
            DiaSum += marks[row++][col++];
            
        }
        
        // To calculate Secondary Diagonal..

        row = 0;
        col = marks[0].length-1;
        for(int i = 0; i < marks.length; i++){
            if(row == col) continue;
            DiaSum += marks[row++][col--];
            
        }

        System.out.println(DiaSum);
    }
    public static void main(String args[]) {
        int marks[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 1, 2, 3, 4 } };
            DiagonalAdd(marks);
    }
}