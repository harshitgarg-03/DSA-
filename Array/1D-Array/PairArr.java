import java.util.*;

public class PairArr {
    public static void main(String args[]) {
        int marks[] = {2, 4, 6, 8, 10, 12, 14};
        int i = 0;
        int j = i+1;
        while(i < marks.length-2){
            if(j == marks.length-1){
                System.out.println("(" + marks[i] + "," + marks[j] + ")");
                i = i+1;
                j = i+1;
            }

            System.out.println("(" + marks[i] + "," + marks[j] + ")");
            j++;
        }
    }
}
