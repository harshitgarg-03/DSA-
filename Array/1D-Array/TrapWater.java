import java.util.*;

public class TrapWater {

    /*
     * public static int trappingH2O(int marks[]) {
     * int counttrapwater = 0;
     * int ms = 0;
     * int highidx = 0;
     * for (int i = 0; i < marks.length-1; i++) {
     * if(ms < marks[i]){
     * ms = marks[i];
     * highidx = i;
     * }
     * }
     * // Left side
     * int lms = 0;
     * for (int i = 0; i < highidx; i++) {
     * lms = Math.max(lms, marks[i]);
     * }
     * int lefttrapwater = 0;
     * for (int i = 0; i < highidx; i++) {
     * lefttrapwater += (lms - marks[i]);
     * }
     * System.out.println(lefttrapwater);
     * // lefttrapwater += (ms - lms);
     * 
     * // Right side
     * int rms = 0;
     * for (int i = highidx+1; i < marks.length; i++) {
     * rms = Math.max(rms, marks[i]);
     * }
     * int righttrapwater = 0;
     * for (int i = highidx+1; i < marks.length; i++) {
     * righttrapwater += (rms - marks[i]);
     * }
     * // righttrapwater += (ms - rms);
     * 
     * // Total
     * counttrapwater = (righttrapwater + lefttrapwater);
     * return counttrapwater;
     * }
     * 
     */

    public static int Leftmax(int i) {
        int marks[] = {0,1,0,2,1,0,1,3,2,1,2,1};

        int ms = marks[0];

        for (int k = 0; k < i; k++) {
            ms = Math.max(ms, marks[k]);
        }
        return ms;
    }

    public static int Rightmax(int i) {
        int marks[] = {0,1,0,2,1,0,1,3,2,1,2,1};

        int ms = marks[marks.length - 1];

        for (int k = i + 1; k < marks.length; k++) {
            ms = Math.max(ms, marks[k]);
        }
        return ms;
    }

    public static int trappingH2O(int marks[]) {
        int counttrapwater = 0;
        int maxleft;
        int maxright;
        for (int i = 1; i < marks.length - 1; i++) {
            maxleft = Leftmax(i);
            maxright = Rightmax(i);
            int sortedarray[] = marks.clone();
            Arrays.sort(sortedarray);
            if (maxleft < marks[i] && maxright < marks[i]) {
                continue;
            } else if (Arrays.equals(marks, sortedarray)) {
                continue;
            } else {
                int min = Math.min(maxright, maxleft);
                counttrapwater += (min - marks[i]);
            }
        }

        return counttrapwater;
    }

    public static void main(String args[]) {
        int marks[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int TrappedWater = trappingH2O(marks);

        System.out.println("Trapped water between building : " + TrappedWater);
    }
}
