import java.util.*;

public class TwiceArr {

    // Longest Method 
/* 
    public static boolean checkingtwice(int clonearray[], int i) {
        int count = 0;

        for (int k = i; k < clonearray.length; k++) {
            if (clonearray[k] == clonearray[i]) {
                count++;
            }
        }

        if (count > 1) {
            System.out.println("in this array duplicete exist.!");
            return true;
        }
        return false;
    }

    public static void twicefind(int marks[]) {
        int clonearray[] = marks.clone();
        for (int i = 0; i < marks.length; i++) {
            boolean result = checkingtwice(clonearray, i);
            if (result) {
                return;
            }
        }

        System.out.println("no any duplicate in this arrray .!");
    }

    public static void main(String args[]) {
        int marks[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        twicefind(marks);
    }
*/

    // Short Trick 

    public static void main(String args[]) {
        int marks[] = { 1, 2, 3, 4};
        for (int i = 0; i < marks.length-1; i++) {
            int result = (marks[i] ^ marks[i+1]);
            if(result == 0){
                System.out.println("duplicate exist .!");
                return;
            }
        }
        System.out.println("no duplicate exist .!");
    }
}
