import java.util.*;

public class Sort012 {

    public static void sortElem(int nums[]) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high){
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if (nums[mid] == 1){
                mid++;
            }
            else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    
        for (int index = 0; index < nums.length; index++) {
            System.out.print(nums[index] + " ");
        }
    }

    public static void main(String args[]) {
        int nums[] = { 2, 0, 2, 1, 1, 0 };

        sortElem(nums);
    }
}