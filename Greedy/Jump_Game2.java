public class Jump_Game2 {
    public static void main(String args[]) {
        int nums[] = { 2, 3, 1, 1, 4 };

        int max_Turn = Integer.MAX_VALUE;

        int n = nums.length;

        int max_idx = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int j = i + nums[i];
            count++;
            while (i <= j) {
                max_idx = Math.max(max_idx, i + nums[i]);
                if (max_idx == n - 1) {
                    System.out.println("max turn is " + count);
                }
            }

        }
    }
}