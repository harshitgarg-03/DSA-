
import java.util.PriorityQueue;

public class N_ropes {
    public static void main(String[] args) {
        int arr[] = {4, 2, 7, 6, 9};

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < arr.length; i++){
            pq.add(arr[i]);
        }

        int cost = 0;
        while(pq.size()> 1){
            int a = pq.remove();
            int b = pq.remove();

            cost += (a+b);
            pq.add(a+b);
        }
        System.out.println("cost is :: " + cost);
    }
}
