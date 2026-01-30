public class FastExponent {
// o(logn) in this pow convert binary number 
    public static void CalculateExponent(int num, int pow) {
        int ans = 1;
        while (pow != 0){
            int n = pow & (1 << 0);
            if( n == 1){
                ans = ans* num;
            }

            num = num*num;
          pow = pow >> 1;
        }
        System.out.println("the power of thr number is " + ans);
    }
    public static void main(String args[]) {
        int num = 3;
        int pow = 5;

        CalculateExponent(num, pow);
    }
}