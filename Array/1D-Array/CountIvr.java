public class CountIvr {
    public static void main(String[] args) {
        int nums[] = {5, 3, 2, 4, 1};

        int n = nums.length;
        int lptr = 0;
        int rptr = n-1;
        int count = 0;
        while(lptr < n){
            if(rptr <= lptr){
                rptr = n-1;
                lptr++;
                continue;
            }

            else if((lptr < rptr) && (nums[lptr] > nums[rptr])){
                // System.out.println(nums[lptr] + "," + nums[rptr]);
                count++;
            }

            rptr--;
        }

        System.out.println("count is " + count);
    }
}
