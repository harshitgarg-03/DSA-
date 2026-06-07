// pair sum question approach same 


public class ContainWater {

    public static void main(String[] args) {

        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        int maxWater = 0;
        int n = height.length;

        // O(n^2) approach
        // for (int i = 0; i < n; i++) {
        // for (int j = i + 1; j < n; j++) {
        // int min = Math.min(height[i], height[j]);
        // int vol = min * (j-i);
        // if (vol > maxWater) {
        // maxWater = vol;
        // }
        // }
        // }

        // O(n) approach
        int lp = 0;
        int rp = n - 1;
        while (lp < rp) {
            int min = Math.min(height[lp], height[rp]);
            int vol = min * (rp - lp);
            if (vol > maxWater) {
                maxWater = vol;
            }

            if(lp < rp){
                lp++;
            } else {
                rp--;
            }
        }
        System.out.println("max volume is " + maxWater);
    }
}
