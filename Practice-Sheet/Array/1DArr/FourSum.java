import java.util.*;

public class FourSum {

    public static void GettingSum(int nums[], int target) {
        int i = 0;
        int j = nums.length - 1;
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        while (i < nums.length - 3) {
            int left = i + 1;
            int right = j - 1;

            while (left < right) {
                int sum = (nums[i] + nums[left] + nums[right]+ nums[j]);

                if (sum == target) {
                    list.add(Arrays.asList(nums[i], nums[left], nums[right], nums[j]));
                    left++;
                    right--;
                }

                else if (sum > target) {
                    right--;
                }

                else {
                    left++;
                }
            }
            i++;
        }
    
        Set<List<Integer>> set = new LinkedHashSet<>(list);

        List<List<Integer>> UniqueList = new ArrayList<>(set);

        System.out.println(UniqueList);
    }

    public static void main(String args[]) {
        int nums[] = { 1, 0, -1, 0, -2, 2 };
        int target = 0;

        GettingSum(nums, target);
    }
}