import java.util.*;

public class ShortestPath {
    public static void ShortestWay(String str) {
        int x1 = 0;
        int y1 = 0;

        int x = 0;
        int y = 0;

        for (int index = 0; index < str.length(); index++) {
            if(str.charAt(index) == 'N'){
                y++;
            }
            else if(str.charAt(index) == 'S'){
                y--;
            }
            else if(str.charAt(index) == 'E'){
                x++;
            }
            else if(str.charAt(index) == 'W'){
                x--;
            }

        }
        double xdirsum = Math.pow((x-x1), 2);
        double ydirsum = Math.pow((y-y1), 2);

        double Shortpath = Math.sqrt(xdirsum+ydirsum);

        System.out.println("x : " + x + "  , Y : " + y);
        System.out.println("Shortest path is : " + Shortpath);
    }
    public static void main(String args[]) {
        String str = "WNEENESENNN";

        ShortestWay(str);
    }
}