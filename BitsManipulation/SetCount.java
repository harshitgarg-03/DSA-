public class SetCount {
    public static void main(String args[]) {
        int n = 1;
        int count = 0;
        while (n != 0) {
            int bit = n & (1 << 0);
            if (bit == 1) {
                count++;
            }

            n = (n >> 1);
        }

        System.out.println("Total set bits are : " + count);
    }
}