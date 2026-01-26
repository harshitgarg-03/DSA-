import java.util.*;

public class Selection {
    public static void SelectionSort(int marks[]) {
        int p = 1;
       
        while (p < marks.length) {
            int min = marks[p];
            int k = p;
            for (int i = p; i < marks.length; i++) {
                if(marks[i] < min){
                    min = marks[i];
                    k = i;
                }
            }
            if (marks[p - 1] > min) {
                int tepm = marks[p - 1];
                marks[p - 1] = min;
                marks[k] = tepm;
            }
            p++;
        }
        for (int index = 0; index < marks.length; index++) {
            System.out.print(marks[index] + " ");
        }

    }

    public static void main(String args[]) {
        int marks[] = { 5,2,3,1, 4 };
        SelectionSort(marks);
    }
}