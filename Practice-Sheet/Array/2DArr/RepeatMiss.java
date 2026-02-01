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

        Arrays.sort(nums);
        int count = 0;
        for (int index = 0; index < nums.length-1; index++) {
            if((nums[index]^nums[index+1]) == 0){
                nums[index] = 0;
                System.out.println("Repeating number is : " + nums[index+1]);
            }

            count += nums[index];

        }
        count += nums[nums.length-1];
        int TotalSum = nums.length*(nums.length+1)/2;
        System.out.println(TotalSum);
        int missingNum = Math.abs(TotalSum - count);
        System.out.print("Missing Number is : " + (missingNum));
    }
    public static void main(String args[]) {
        int marks[][] = {{9,1,7},{8,9,2},{3,4,6}};
        GetRepeatMissNum(marks);
    }
}