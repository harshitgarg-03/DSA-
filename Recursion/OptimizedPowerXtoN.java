
public class OptimizedPowerXtoN {
    public static int CalculatePower(int x, int n) {
        if(n == 0){
            return 1;
        }
        int halfnum = CalculatePower(x, n/2);
        int halfsq = (halfnum * halfnum);

        if(n % 2 != 0){
            halfsq = x*halfsq;
        }
        return halfsq;
    }
    public static void main(String args[]) {
        int x = 2;
        int n = 6;
        int num = CalculatePower(x, n);
        System.out.println("pwer is " + num);
    }
}