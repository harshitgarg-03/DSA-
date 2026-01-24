import java.util.*;

public class TripletPr {

    public static void findtriplet(int marks[]) {

        // BASE CASE...
        if (marks.length < 3) {
            System.out.println("Array length not exist for triplet..!");
            return;
        }

        Arrays.sort(marks);

    }

    public static void main(String args[]) {
        int marks[] = { 0, 0, 0, 0 };

        findtriplet(marks);
    }
}
