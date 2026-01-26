import java.util.*;

public class Insertion {
    public static void InsertionSort(int marks[]) {
        for(int i = 1; i < marks.length; i++){
            int curr = i;
            int prev = i-1;

            while(prev >= 0 && marks[prev] > marks[curr]){
                marks[prev+1] = marks[prev];
                prev--;
            }

            if(marks[prev+1] > marks[curr]){
                marks[prev+1] = marks[curr];

            }
        }

        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + " ");
        }
    }
    public static void main(String args[]) {
        int marks[] = {5, 4, 1, 3, 2};
        InsertionSort(marks);
    }
}