import java.util.*;

public class TransposeMatrix {
    public static void main(String args[]) {
        int marks[][] = {{1,2,3},{4,5,6}};
        int n = marks.length;
        int m = marks[0].length;

        // Square Matrix then TC(O(N2)) and SC(O(1))
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(marks[j][i] + " ");
            }
            System.out.println("");
        }


    }
}