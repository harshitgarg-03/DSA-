public class Jump_Game2 {
    public static void main(String args[]) {
        int nums[] = {2,3,0,1,4};

        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            farthest = Math.max(farthest, i + nums[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }
        System.out.println("minimum jumps are :: "+ jumps);
    }
}