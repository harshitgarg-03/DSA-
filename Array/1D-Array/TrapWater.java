import java.util.*;

public class TrapWater {

    public static int trappingH2O(int marks[]) {
        int counttrapwater = 0; 
        for (int i = 0; i < marks.length-1; i++) {
            if(marks[i] > marks[i+1]){
                counttrapwater += (marks[i] - marks[i+1]);
            }else if(marks[i] < marks[i+1]){
                counttrapwater += (marks[i+1] - marks[i]);
            }
        }
        return counttrapwater;
    }
    public static void main(String args[]) {
        int marks[] = {4, 2, 0, 6, 3, 2, 5};

        int TrappedWater = trappingH2O(marks);

        System.out.println("Trapped water between building : "+ TrappedWater);
    }
}
