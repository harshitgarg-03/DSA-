public class Monotonic {
    public static void main(String[] args) {
        int nums[] = {1,3,2};

        int n = nums.length;
        int asc = 0;
        int desc = 0;
        int lp = 0;
        int ptr = lp+1;

        while(ptr < n){
            if(nums[lp] == nums[ptr]){
                asc++;
                desc++;
            }
            else if(nums[lp] < nums[ptr]){
                asc++;
            }
            else{
                desc++;
            }
            lp++;
            ptr++;
        }

        if(asc == n-1 || desc == n-1){
            System.out.println("It's Monotonic ");
        } else {
            System.out.println("It's Not Monotonic");
        }
    }
}
