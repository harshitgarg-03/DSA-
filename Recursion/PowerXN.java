
public class PowerXN {
    public static int CalculatePower(int x, int n) {
        if(n == 0){
            return 1;
        }
        return x * CalculatePower(x, n-1);
    }
    public static void main(String args[]) {
        int x = 3;
        int n = 5;
        int num = CalculatePower(x, n);
        System.out.println("pwer is " + num);
    }
}