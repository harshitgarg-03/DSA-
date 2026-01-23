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

        ArrayList<int[]> list = new ArrayList<>();
        // ArrayList<ArrayList<int[]>> list = new ArrayList<>();
        while (i <= marks.length - 3) {
            int Ft = marks[i];
            int St = marks[i + 1];

            // if(i > 0 && marks[i] == marks[i-1]) continue; // TO AVOID DUPLICACY .. IT CAN BE MORE OPTIMIZED 
            for (int j = i + 2; j < marks.length; j++) {
                if ((Ft + St + marks[j]) == 0) {
                    int arr[] = { Ft, St, marks[j] };
                    list.add(arr);
                }
            }
            i = i+1;
        }
        for (int j = 0; j < list.size(); j++) {
            System.out.println(Arrays.toString(list.get(j)));
        }
    }

    public static void main(String args[]) {
        int marks[] = {-1, 0, 1, 2, -1, -4};

        findtriplet(marks);
    }
}
