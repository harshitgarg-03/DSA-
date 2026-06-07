public class Pair2Sum {
    public static void main(String[] args) {
        int nums[] = {11, 15, 6, 8, 9, 10};
        int target = 16;
        int n = nums.length;
        // BreakinPOint

        int rp = 0;
        int lp = 0;
        for (int i = 0; i < n-1 ; i++){
            if(nums[i] > nums[i+1]){
                lp = i;
                rp = i+1;
            }
        }
        // System.out.println(lp + " " + rp);

        while(lp != rp){
            rp = ((n+1+rp) % n);
            lp = (lp % n);
            if(nums[lp] + nums[rp] == target){
                System.out.println("pair is ( " + nums[lp] + ", " + nums[rp] + ") ");
                return;
            }

            if(nums[lp] + nums[rp] > target){
                rp--;
            }
            else{
                lp++;
            }
        }
    }
}
