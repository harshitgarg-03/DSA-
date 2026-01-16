import java.util.*;

public class ReverseAr {
    
    public static void main(String args[]) {
        int marks[] = {1, 2, 3, 4, 5, 6};
        int i = 0;
        int j = marks.length-1;

        while (i < j) {
            // marks[i] = marks[i] + marks[j];
            // marks[j] = marks[i] - marks[j];
            // marks[i] = marks[i] - marks[j];
            
            marks[i] = marks[i] ^ marks[j];
            marks[j] = marks[i] ^ marks[j];
            marks[i] = marks[i] ^ marks[j];

            
            j--;
            i++;
        }


        for (int k = 0; k < marks.length; k++){
            System.out.print(marks[k] + " ");
        }
    }
}
