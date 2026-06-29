import java.util.LinkedList;
import java.util.Queue;

public class StackusingQ {

    public static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public void pushing (int data){
            q1.add(data);
        }

        public void popping (){
            int n = q1.size()-1;
            int i = 1;
            while (i <= n){
                int data = q1.remove();
                q2.add(data);
                i++;
            }
            int data = q1.remove();
            System.out.println("removed data is " + data);

            while(!q2.isEmpty()){
                int popdata = q2.remove();
                q1.add(popdata);
            }
        }

        public void peeking (){
            int n = q1.size()-1;
            int i = 1;
            while (i <= n){
                int data = q1.remove();
                q2.add(data);
                i++;
            }
            int data = q1.remove();
            q2.add(data);
            System.out.println("peek data is " + data);

            while(!q2.isEmpty()){
                int popdata = q2.remove();
                q1.add(popdata);
            }
        }
        public void printing(){
            while(!q1.isEmpty()){
                int data = q1.remove();
                System.out.print(data + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
         Stack s1 = new Stack();
         s1.pushing(1);
         s1.pushing(2);
         s1.pushing(3);
         s1.pushing(4);
         s1.pushing(5);
        
         s1.peeking();
         s1.popping();
         s1.popping();
         s1.pushing(10);
         s1.printing();
    }
}
