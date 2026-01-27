import java.util.*;

public class RotatedArr {

    // check given target in array then return its idx 
    public static int SortedArray(int marks[], int target) {
        for (int i = 0; i < marks.length; i++) {
            if(marks[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int marks[] = {1, 2, 3, 4, 5};
        int target = 3;
        int result = SortedArray(marks, target);
        System.out.println(result);
    }
}
