import java.util.*;

public class FindSingleElem {

    public static int singleNumber(int[] nums) {
        int singlenum = nums[0];
        for (int i = 1; i < nums.length; i++) {

            singlenum = singlenum ^ nums[i];

        }

        return singlenum;
    }

    public static void main(String args[]) {
        int nums[] = { 1, 2, 2 };
        int single = singleNumber(nums);
        System.out.println("single number is " + single);
    }
}