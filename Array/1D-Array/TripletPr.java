import java.util.*;

public class TripletPr {

    public static void findtriplet(int marks[]) {

        // BASE CASE...
        if (marks.length < 3) {
            System.out.println("Array length not exist for triplet..!");
            return;
        }
        /*
         * int Arr[] = new int[marks.length-3];
         * int fs = marks[0];
         * int ls = marks[marks.length-1];
         * int k = marks.length-1;
         * int j = 0;
         * 
         * while ( k >= 2) {
         * for(int i = 1; i <= marks.length-2; i++ ){
         * if((ls + fs + marks[i]) == 0){
         * Arr[i] = {ls, fs, marks[i]};
         * System.out.println(fs + " " + marks[i] + " " + ls );
         * }
         * }
         * 
         * System.out.println("ls"+ ls);
         * System.out.println("k"+ k);
         * k--;
         * ls = marks[k];
         * }
         */

        Arrays.sort(marks);

        int i = 0;

        ArrayList<int[]> list = new ArrayList<>();
        // ArrayList<ArrayList<int[]>> list = new ArrayList<>();
        while (i <= marks.length - 3) {
            int Ft = marks[i];
            int St = marks[i + 1];

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
        int marks[] = { -1, 0, 1, 2, -1, -4 };

        findtriplet(marks);
    }
}
