
public class Power2OrNot {
    public static void main(String args[]) {
        int n = 16;

        if((n&n-1) == 0){
            System.out.println("it's a number is power of 2");
        } else {
            System.out.println("Number is not a power of 2");
        }
    }
}