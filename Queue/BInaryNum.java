
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BInaryNum {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<String> list = new ArrayList<>();
        Queue<String> q = new LinkedList<>();

        q.add("1");

        while(n-- > 0){
            String temp = q.remove();
            list.add(temp);

            q.add(temp + "0");
            q.add(temp + "1");
            
        }

        System.out.println(list);
    }
}
