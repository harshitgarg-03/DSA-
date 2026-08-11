

public class Remove_Dup {

    public static void main(String args[]) {
        int nums[] = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };

        int k = 1;
        int ct = 1;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1] && ct < 2){
                nums[k++] = nums[i];
                ct++;
            }
            else if (nums[i] != nums[i-1]) {
                nums[k++] = nums[i];
                ct = 1;
            }
        }

        // System.out.println(Arrays.toString(nums));
        System.out.println("k is :: " + k);
    }
}