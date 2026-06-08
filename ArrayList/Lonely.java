import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Lonely {
    public static void main(String[] args) {
        int nums[] = { 10, 6, 5, 8 };

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        int n = nums.length;
        int lp = 0;
        int rp = lp + 1;

        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        while (rp < n) {
            if ((nums[lp] + 1 == nums[rp]) || (nums[lp] == nums[rp])) {
                list.add(nums[lp]);
                list.add(nums[rp]);
            }
            lp++;
            rp++;
        }

        // System.out.println("helloo ");
        HashSet<Integer> set = new HashSet<>(list);

        for (int num : nums) {
            if (!set.contains(num)) {
                result.add(num);
            }
        }

        System.out.println(result);
    }
}
