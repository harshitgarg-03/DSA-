public class TilingProblem {
    public static int CalculateWays(int num) {
        if(num == 0 || num == 1){
            return 1;
        }
        int verticalways = CalculateWays(num - 1);
        int horizontalalways = CalculateWays(num - 2);

        int ways = (verticalways + horizontalalways);
        return ways;
    }

    public static void main(String args[]) {
        int n = 5;
        int ways = CalculateWays(n);
        System.out.println("Ways are " + ways);
    }
}