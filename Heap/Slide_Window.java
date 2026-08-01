
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Slide_Window {
    static class info implements Comparable<info> {
        int idx;
        int val;

        public info(int idx, int val) {
            this.idx = idx;
            this.val = val;
        }

        @Override
        public int compareTo(info t1) {
            return this.val - t1.val;
        }
    }

    public static void window(int i, PriorityQueue<info> pq, int arr[], int newarr[], int j, int k) {
        info elem = pq.peek();
        newarr[j++] = elem.val;
        if (i >= arr.length) {
            return;
        }

        while (!pq.isEmpty() && pq.peek().idx <= i - k) {
            pq.remove();
        }

        pq.add(new info(i, arr[i]));
        window(i + 1, pq, arr, newarr, j, k);

    }

    public static void main(String args[]) {
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;

        int n = arr.length;
        int newarr[] = new int[n - k + 1];

        PriorityQueue<info> pq = new PriorityQueue<>(Collections.reverseOrder());

        int i = 0;
        while (i < k) {
            pq.add(new info(i, arr[i]));
            i++;
        }

        window(i, pq, arr, newarr, 0, k);

        System.out.println("niche :: " + Arrays.toString(newarr));
    }
}