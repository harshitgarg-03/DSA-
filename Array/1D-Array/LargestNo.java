import java.util.*;

public class LargestNo {
    public static void LargestNumber(int number[], int maxnum) {
        for (int i = 0; i < number.length; i++) {
            if(maxnum < number[i]){
                maxnum = number[i];
            }
        }

        System.out.print("Largest number in array is : ");
        System.out.print(maxnum);
    }
    public static void main(String args[]) {
        int number[] = {1, 4, 155, 6, 800, 10, 55};
        int maxnum = Integer.MIN_VALUE;

        LargestNumber(number, maxnum);
    }
}
