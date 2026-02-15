import java.util.*;

public class Fibonacci {
    public static int FibSeries(int term) {
        if( term == 0){
            return 0;
        }

        return (FibSeries(term-1) + FibSeries(term-2));
    }
    public static void main(String args[]) {
        int n = 5;
        int sum = FibSeries(n);
        System.out.println(sum);
    }
}