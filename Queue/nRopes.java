
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class nRopes {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3};
        Arrays.sort(arr);

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < arr.length; i++){
            q.add(arr[i]);
        }
        int sum = 0;
        int data = q.remove();

        while(!q.isEmpty()){
            int qdata = q.remove();
            data = (qdata+data);
            sum = (sum + data);
        }

        System.out.println("minimum cost is " + sum);
    }
}