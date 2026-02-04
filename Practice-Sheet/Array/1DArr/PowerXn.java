import java.util.*;

public class PowerXn {
    public static void main(String args[]) {
        int x = 2;
        int n = 2;
        long pow = Math.abs((long)n);
        double ans = 1;
        while (pow != 0) {
            if ((pow & 1) == 1) {
                ans *= x;
            }

            x = x * x;
            pow = pow >> 1;
        }
        if (n < 0) {
            System.out.println(1 / ans);
        } else {
            System.out.println(ans);
        }
    }
}