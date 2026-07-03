import java.util.Arrays;

public class MIces_holes {
    public static void main(String[] args) {
        int mices[] = {-10, 7, -2, 3, 1, 4, 2, -3, 9, 8};

        int holes[] = {2, 2, -8, -7, 9, 3, -1, 8, -6, 0};

        Arrays.sort(mices);
        Arrays.sort(holes);
        
        int maxtime = 0;
        
        for(int i = 0; i < mices.length; i++){
            int time = Math.abs(holes[i] - mices[i]);
            
            maxtime = Math.max(time, maxtime);
        }
        System.out.println("maximum time is " + maxtime);
    }
}
