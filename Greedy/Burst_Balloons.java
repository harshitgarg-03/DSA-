
import java.util.Arrays;

public class Burst_Balloons {
    public static void main(String[] args) {
        int points[][] = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};

        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
       System.out.println(points.length + " " + points[0].length);

        int lastIdx = points[0][1];
        int count = 0;

        for(int i = 1; i < points.length; i++){
            if(points[i][0] <= lastIdx){
                System.out.println(" 0");
            }else {
                count++;
                lastIdx = points[i][1];
            }
        }

        System.out.println("min arrows is " + (count+1));
    }
}
