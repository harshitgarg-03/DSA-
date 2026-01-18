import java.util.*;

// Kadane's algo with n TC
public class MaxSubArrKadanes {

    public static int Maxsum(int marks[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 0) {
                if (count == marks.length) {
                    return 0;
                }
                count++;
            }
        }
        for (int i = 0; i < marks.length; i++) {
            cs += marks[i];
            if (cs < 0) {
                cs = 0;
            }

            ms = Math.max(cs, ms);
        }
        return ms;
    }

    public static void main(String args[]) {
        // int marks[] = {-2, -3, 4, -1, -2, 1, 5, -3 };
        int marks[] = {-2, -3, -1, -10, -5};
        int maxsum = Maxsum(marks);

        if (maxsum == 0) {
            System.out.println("Maximum subarray's sum is : " + maxsum);

        } else {
            System.out.println("Maximum subarray's sum is : " + maxsum);

        }

    }
}