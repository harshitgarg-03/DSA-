import java.util.*;

// Printing elements in spiral fashion (outer to iner boundary)

public class SpiralMatrix {
    public static void SpiralElements(int marks[][]) {
        int startrow = 0;
        int startcol = 0;
        int endrow = marks.length;
        int endcol = marks[0].length;

        while(startrow < endrow && startcol < endcol){
            // top
            for (int i = startcol; i < endcol; i++){
                System.out.print(marks[startrow][i] + " ");
            }
            // right
            for (int i = startrow+1; i < endrow; i++){
                System.out.print(marks[i][endcol] + " ");
            }
            // bottom
            for (int i = endcol-1; i >= startcol; i--){
                System.out.print(marks[endrow][i] + " ");
            }
            // left
            for (int i = endrow-1; i >= startcol+1; i--){
                System.out.print(marks[endrow][startcol] + " ");
            }

            startrow++;
            startcol++;
            endrow--;
            endcol--; 

        }
    }

    public static void main(String args[]) {
        int marks[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 1, 2, 3 }, { 4, 5, 6, 7 } };
        SpiralElements(marks);
    }
}