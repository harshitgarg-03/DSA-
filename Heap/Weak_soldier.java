import java.util.Arrays;
import java.util.PriorityQueue;

public class Weak_soldier {
    static class info implements Comparable<info> {
        int idx;
        int soldier;

        public info(int idx, int soldier) {
            this.idx = idx;
            this.soldier = soldier;
        }

        @Override
        public int compareTo(info s2) {
            if (this.soldier == s2.soldier) {
                return this.idx - s2.idx; // smaller index first
            }
            return (this.soldier - s2.soldier);
        }

    }

    public static void main(String[] args) {
        PriorityQueue<info> pq = new PriorityQueue<>();

        int arr[][] = { { 1, 1, 0, 0, 0 }, { 1, 1, 1, 1, 0 }, { 1, 0, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 1, 1, 1, 1, 1 } };
        int k = 3;
        int weak[] = new int[k];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[0].length; j++) {
                count += arr[i][j];
            }
            pq.add(new info(i, count));
        }

        int p = 1;
        while (p <= k) {
            info cts = pq.remove();
            System.out.println("cts idx is " + cts.idx);
            weak[p - 1] = cts.idx;
            p++;
        }

        // System.out.println(Arrays.toString(arr));
    }
}