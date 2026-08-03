
public class Two_sum {
    static class info implements Comparable<info> {
        int idx;
        int val;

        public info(int idx, int val) {
            this.idx = idx;
            this.val = val;
        }

        public int compareTo(info that) {
            return this.val - that.val;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int k = 9;

        System.out.println("hello ");
    }
}
