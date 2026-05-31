public class RatInMaze {

    public static void findways(int maze[][], int vis[][], int x, int y, String ans, int n) {
        if(x == n-1 && y == n-1){
            System.out.println(ans);
            return;
        }

        // Downward
        if(x+1 < n && vis[x+1][y] == 0 && maze[x+1][y] == 1){
            vis[x+1][y] = 1;
            findways(maze, vis, x+1, y, ans+"D", n);
            vis[x+1][y] = 0;
        }
        // Right
        if(y+1 < n && vis[x][y+1] == 0 && maze[x][y+1] == 1){
            vis[x][y+1] = 1;
            findways(maze, vis, x, y+1, ans+"R", n);
            vis[x][y+1] = 0;
        }
        // UPWArd

        if(x-1 >= 0  && vis[x-1][y] == 0 && maze[x-1][y] == 1){
            vis[x-1][y] = 1;
            findways(maze, vis, x-1, y, ans+"U", n);
            vis[x-1][y] = 0;
        }
        // Left
        if(y-1 >= 0  && vis[x][y-1] == 0 && maze[x][y-1] == 1){
            vis[x][y-1] = 1;
            findways(maze, vis, x, y-1, ans+"L", n);
            vis[x][y-1] = 0;
        }
            
    }
    public static void main(String args[]) {
        int maze[][] = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}};
        int n = maze.length;
        int vis[][] = new int[n][n];

        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                vis[i][j] = 0;
            }
        }
        findways(maze, vis, 0, 0, "", n);
    }
}