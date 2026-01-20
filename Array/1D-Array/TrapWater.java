import java.util.*;

public class TrapWater {

    public static int trappingH2O(int marks[]) {
        int counttrapwater = 0; 
        int ms = 0;
        int highidx = 0;
        for (int i = 0; i < marks.length-1; i++) {
            if(ms < marks[i]){
                ms = marks[i];
                highidx = i;
            }
        }
        // Left side
        int lms = 0;
        for (int i = 0; i < highidx; i++) {
            lms = Math.max(lms, marks[i]);
        }
        int lefttrapwater = 0;
        for (int i = 0; i < highidx; i++) {
            lefttrapwater += (lms - marks[i]);
        }
        System.out.println(lefttrapwater);
        // lefttrapwater += (ms - lms);
        
        // Right side
        int rms = 0;
        for (int i = highidx+1; i < marks.length; i++) {
            rms = Math.max(rms, marks[i]);
        }
        int righttrapwater = 0;
        for (int i = highidx+1; i < marks.length; i++) {
            righttrapwater += (rms - marks[i]);
        }
        // righttrapwater += (ms - rms);

        // Total 
        counttrapwater = (righttrapwater + lefttrapwater);
        return counttrapwater;
    }
    public static void main(String args[]) {
        int marks[] = {0,1,0,2,1,0,1,3,2,1,2,1};

        int TrappedWater = trappingH2O(marks);

        System.out.println("Trapped water between building : "+ TrappedWater);
    }
}
