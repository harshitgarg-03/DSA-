import java.util.*;

public class Fibonacci {
    public static int FibSeries(int term) {
        if (term == 0 || term == 1) {
            return term;
        }
        int n = FibSeries(term - 1) + FibSeries(term - 2);
        // System.out.println(FibSeries(term-1) + " " + FibSeries(term-2));

        return n;
    }

    public static void main(String args[]) {
        int n = 5;
        int sum = FibSeries(n);
        System.out.println(sum);
    }
}