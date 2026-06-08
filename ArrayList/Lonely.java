
import java.util.ArrayList;
import java.util.Arrays;

public class Lonely {
    public static void main(String[] args) {
        int nums[] = {10, 6, 5, 8};

        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        int lp = 0;
        int rp = lp+1;

        Arrays.sort(nums);

        while(rp < n){
            if(nums[lp] == nums[rp]+1){
                list.add(nums[lp]);
                list.add(nums[rp]);
            }
            lp++;
            rp++;
        }

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
