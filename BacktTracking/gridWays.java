public class gridWays {
    public static int findgridways(int n, int m, int i, int j) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == m) {
            return 0;
        }

        int w1 = findgridways(n, m, i + 1, j);
        int w2 = findgridways(n, m, i, j + 1);
        return w1 + w2;
    }

    public static void main(String args[]) {
        int n = 3;
        int m = 3;
        System.out.println(findgridways(n, m, 0, 0));
        
    }
}

// Time complexity 2^(m+n);

// Grid Ways TRick (n-1+m-1)!/(n-1)!*(m-1)!, TC O(n);