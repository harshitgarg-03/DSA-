import java.util.*;

public class Factorialnum {
    public static int Factornum(int num) {
        if(num <= 1){
            return 1;
        }

       return ( num * Factornum(num-1));
    }
    public static void main(String args[]) {
        int n = 0;
        int product = Factornum(n);
        System.out.println("Factorial is : " + product);
    }
}