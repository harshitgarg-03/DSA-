
import java.util.Arrays;

public class Indian_Coins {
    public static void main(String args[]) {
        int dem[] = {1, 2, 5, 10, 20, 50, 100, 200, 500};
        int value = 2012;
        int count = 0;
        Arrays.sort(dem);
        for (int i = dem.length - 1; i >= 0; i--) {
            if (value >= dem[i] && value > 0) {
                System.out.println("notes is " + dem[i]);
                count++;

                value = value - dem[i];
                i = i + 1;
            } // brute 

            // while (value >= dem[i]) {
            //     value -= dem[i];
            //     count++;
            // } // optimal 
        }

        System.out.println("total count is " + count);
    }
}