import java.util.*;

public class MajorityElem {
    public static int main(String args[]) {
        int nums[] = { 1, 1, 2 };
        int n = nums.length;
        if (n == 1 || n == 2) {
            return nums[0];
        }
        // 1 approach
        // int count = 1;
        // int maj = nums[0];
        // for (int i = 1; i < n; i++){
        // if(count > n/2){
        // break;
        // }
        // else if(maj == nums[i]){
        // count++;
        // }
        // else {
        // count = 1;
        // maj = nums[i];
        // }
        // }

        Arrays.sort(nums);
        return nums[n / 2];
    }
}