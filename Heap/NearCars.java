
import java.util.PriorityQueue;

public class NearCars {

    static class Origin_Distance implements Comparable<Origin_Distance>{
        int x;
        int y;
        int dist;
        int idx;

        public Origin_Distance(int x, int y, int dist, int idx){
            this.x = x;
            this.y = y;
            this.dist = dist;
            this.idx = idx;
        }

        @Override
        public int compareTo(Origin_Distance o2){
            return  this.dist - o2.dist;
        }
    }
    public static void main(String[] args) {
        int pts[][] = {{1, 3}, {-2, 2}};
        int k = 1;
        PriorityQueue<Origin_Distance> pq = new PriorityQueue<>();

        for(int i = 0; i < pts.length; i++){
            int dist = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new Origin_Distance(pts[i][0], pts[i][1], dist, i));
        }

        for(int i = 0; i < k; i++){
            System.out.println(pq.remove().idx);
        }
    }
}
