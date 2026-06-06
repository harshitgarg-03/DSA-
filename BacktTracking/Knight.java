public class Knight {

    public static boolean solve(int[][] grid, int i, int j, int count) {

        int n = grid.length;

        if (count == n * n) {
            return true;
        }

        int[] dx = { -2, -2, 2, 2, -1, 1, -1, 1 };
        int[] dy = { 1, -1, 1, -1, -2, -2, 2, 2 };

        for (int k = 0; k < 8; k++) {

            int ni = i + dx[k];
            int nj = j + dy[k];

            if (ni >= 0 && ni < n &&
                    nj >= 0 && nj < n &&
                    grid[ni][nj] == count) {

                if (solve(grid, ni, nj, count + 1))
                    return true;
            }
        }

        return false;
    }

    public static void main(String args[]) {
        int grid[][] = { { 0, 11, 16, 5, 20 }, { 17, 4, 19, 10, 15 }, { 12, 1, 8, 21, 6 }, { 3, 18, 23, 14, 9 },
                { 24, 13, 2, 7, 22 } };

        if (grid[0][0] != 0) {
            System.out.println(false);
            return;
        }

        System.out.println(solve(grid, 0, 0, 1));
    }

}