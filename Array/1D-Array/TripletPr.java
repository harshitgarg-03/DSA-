import java.util.*;

public class TripletPr {

    public static void findtriplet(int marks[]) {

        // BASE CASE...
        if (marks.length < 3) {
            System.out.println("Array length not exist for triplet..!");
            return;
        }

        Arrays.sort(marks);

        int i = 0;

        // ArrayList<int[]> list = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        while (i <= marks.length - 3) {
            int Ft = marks[i];
            int St = marks[i + 1];

            // if (i > 0 && marks[i] == marks[i - 1]) {
            // System.out.println("enter ");
            // i = i + 1;
            // continue;
            // } // TO AVOID DUPLICACY .. IT CAN
            // BE MORE OPTIMIZED
            for (int j = i + 2; j < marks.length; j++) {
                // if((marks[j] == St) && j <= marks.length-1){
                // continue;
                // }
                if ((Ft + St + marks[j]) == 0) {
                    List<Integer> a = new ArrayList<>();
                    a.add(Ft);
                    a.add(St);
                    a.add(marks[j]);
                    list.add(a);
                }
            }
            i = i + 1;
        }

        List<List<Integer>> uniquelist = new ArrayList<>();
        for (List<Integer> curr : list) {

            if (!uniquelist.contains(curr)) {
                uniquelist.add(curr);
            }
        }

        System.out.println(uniquelist);
    }

    public static void main(String args[]) {
        int marks[] = { 0, 0, 0, 0 };

        findtriplet(marks);
    }
}
