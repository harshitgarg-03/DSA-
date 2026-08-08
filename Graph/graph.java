
import java.util.ArrayList;


public class graph {

    static class EdgeInfo{
        int src;
        int dest;
        int wt;

        public EdgeInfo(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void main(String[] args) {
        int vertex = 5;
        @SuppressWarnings("unchecked")
        ArrayList<graph.EdgeInfo>[] list = new ArrayList[5];

        for(int i = 0; i < list.length; i++){
            list[i] = new ArrayList<>();
        }
        
        list[0].add(new EdgeInfo(0, 1, 5));// 0 vertex se 

        list[1].add(new EdgeInfo(1, 0, 5));// 1 vertex se 
        list[1].add(new EdgeInfo(1, 2, 1));
        list[1].add(new EdgeInfo(1, 3, 3));

        list[2].add(new EdgeInfo(2, 1, 1));// 2 vertex se 
        list[2].add(new EdgeInfo(2, 3, 1));
        list[2].add(new EdgeInfo(2, 4, 2));

        list[3].add(new EdgeInfo(3, 1, 3));// 3 vertex se
        list[3].add(new EdgeInfo(3, 2, 1));

        list[4].add(new EdgeInfo(4, 2, 2));


        // System.out.println(list[0]);

        // print 2's neighbour 
        for(int i = 0; i < list[2].size(); i++){
            EdgeInfo e = list[2].get(i);

            System.out.println("sorece is :: " + e.src + " destination & weight :: " + e.dest + " & " + e.wt);
        }
    }
}
 