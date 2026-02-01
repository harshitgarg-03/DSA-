import java.util.*;

public class RepeatMiss {

    public static void GetRepeatMissNum(int marks[][]) {
        int n = marks.length;
        int nums[] = new int[n*n];
        int k = 0;
        for(int i =0; i < n; i++){
            for (int j = 0; j < n; j++){
                nums[k] = marks[i][j];
                k++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            System.out.print(nums[index] + " ");
        }
    }
    public static void main(String args[]) {
        int marks[][] = {{1,3},{2,2}};
        GetRepeatMissNum(marks);
    }
}