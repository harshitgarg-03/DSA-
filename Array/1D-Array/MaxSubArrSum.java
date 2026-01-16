import java.util.*;

public class MaxSubArrSum {

    public static int Maxsum(int marks[]) {
        
        int i = 0;
        int j = i;
        int maxsum = Integer.MIN_VALUE;
        while(i <= marks.length-1){
            int currsum = marks[i];
            while(j <= marks.length-1){
                currsum += marks[j];
                if(currsum > maxsum){
                    maxsum = currsum;
                }
                j++;
            }
            if(j == marks.length-1){
                i = i+1;
                j = i;

            }

        }

        return maxsum;
    }
    public static void main(String args[]) {
        int marks[] = {1, 2, -1, 3, 4, -8, -11, 12};

        int sum = Maxsum(marks);

        System.out.println("Maximum sum of Subarrays is : " + sum);

    }
}
