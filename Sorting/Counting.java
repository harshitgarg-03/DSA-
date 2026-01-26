import java.util.*;

public class Counting {
    public static void countingSort(int marks[]) {
        int max = 0;
        for (int index = 0; index < marks.length; index++) {
            max = Math.max(max, marks[index]);
        }

        int countarr[] = new int[max+1];
        
        
        for(int i = 0; i < marks.length; i++){
            int val = marks[i];
            countarr[val]++;
        }

        for(int i = 0; i < countarr.length; i++){
            int count = countarr[i];
            while(count > 0){
                System.out.print(i + " ");
                count--;
            }
        }
    }
    public static void main(String args[]) {
        int marks[] = {1, 2, 1, 0, 0, 1, 4, 3, 3};
        countingSort(marks);
    }
}