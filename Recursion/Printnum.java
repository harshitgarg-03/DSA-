import java.util.*;

public class Printnum {
    public static int Printingnum(int num) {
        if(num == 0){
            return sum; 
        }

        int sum = num + Printingnum(num -1);
    }
    public static void main(String args[]) {
        int num = 10;
        Printingnum(10);
    }
}