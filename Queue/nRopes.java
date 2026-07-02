import java.util.PriorityQueue;


public class nRopes {
    public static void main(String args[]) {
        int arr[] = {10};
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {
            pq.add(num);
        }

        int cost = 0;

        while (pq.size() > 1) {

            int first = pq.poll();
            int second = pq.poll();

            int sum = first + second;

            cost += sum;

            pq.add(sum);
        }

        System.out.println("minimum cost is " + cost);
    }
}