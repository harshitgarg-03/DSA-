import java.util.*;

public class ThreeSum {
    public static void Gettingsum(int nums[]) {
        int i = 0;
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        while (i <= nums.length - 3) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = (nums[i] + nums[left] + nums[right]);

                if(sum == 0){
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }

                else if(sum > 0){
                    right--;
                }

                else {
                    left++;
                }
            }
            i++;
        }
    
        System.out.println(list);
    }

    public static void main(String args[]) {
        int nums[] = {-1,0,1,2,-1,-4};
        Gettingsum(nums);
    }
}