import java.util.*;

/*3 Approch to solve this question 
(1) Linear Search(n2)
(2) Binary Search(nlog(n))
(3) StairCase Search(o(n*m))
*/
public class SearchElement {
    public static void SearchingKey(int marks[][], int target) {
        int row = 0;
        int col = marks[0].length - 1;

        while (row < marks.length && col >= 0) {
            if (marks[row][col] == target) {
                System.out.println("Key Found at " + row + " , " + col);
            }

            if ((marks[row][col - 1] < target || marks[row - 1][col] < target)) {

            }
        }
    }

    public static void main(String args[]) {
        int marks[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target = 3;
        SearchingKey(marks, target);

    }
}