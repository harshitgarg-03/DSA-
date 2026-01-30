public class OddOrEven {
    public static void main(String args[]) {
        int BitMask = 1;
        int n = 0;

        if((n & BitMask) == 0){
            System.out.println("It's an even number ");
        } else {
            System.out.println("It's an odd number ");
        }
    }
}