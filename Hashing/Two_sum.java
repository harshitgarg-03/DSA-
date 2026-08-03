
import java.util.HashMap;

public class Two_sum {
    /*
     * static class info implements Comparable<info> {
     * int idx;
     * int val;
     * 
     * public info(int idx, int val) {
     * this.idx = idx;
     * this.val = val;
     * }
     * 
     * public int compareTo(info that) {
     * return this.val - that.val;
     * }
     * }
     */

    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int k = 9;

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], i);
        }

        for(int i = 0; i < arr.length; i++){
            int t = k-arr[i];

            if(hm.containsKey(t)){
                int otheridx = hm.get(t);
                if(i != otheridx){
                    System.out.println("two idx's are :: " + i + " "+ hm.get(t));
                    break;
                }
            }
        }

        // System.out.println(hm);
    }
}
