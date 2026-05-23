import java.util.*;

public class ProductOfArray {
    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4};
        int n = nums.length;
        int prefNums[] = new int[nums.length];
        int suffNums[] = new int[nums.length];
        int prod = 1;

        for(int i = 0; i < n; i++){
            prod *= nums[i];
            prefNums[i] = prod;
        }
        prod = 1;

        for(int i = n-1; i >= 0; i--){
            prod *= nums[i];
            suffNums[i] = prod;
        }

        // for (int index = 0; index < suffNums.length; index++) {
        //     System.out.print(suffNums[index] + " ");
        // }
        // System.out.println();
        // for (int index = 0; index < suffNums.length; index++) {
        //     System.out.print(prefNums[index] + " ");
        // }

        for(int i = 0; i < nums.length; i++){
            if (i == 0) {
                System.out.print("1212 ");
                nums[i] = suffNums[i+1];
            } 

            if (i == n-1) {
                System.out.print("nope");
                nums[i] = prefNums[i-1];
            }

            else {
                System.out.print("12121 ");
                System.out.print(suffNums[i+1]);
                System.out.print(prefNums[i-1]);
                nums[i] = suffNums[i+1]*prefNums[i-1];
            }
        }

        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}