import java.util.ArrayList;

public class queue {
    // queue implementing using arraylist not an optimal approach 
    public static class Q {
        ArrayList<Integer> list = new ArrayList<>();

        static int front;

        public boolean isQEmpty (){
            return list.isEmpty();
        }

        public void AddQ(int data){
            if(isQEmpty()){
                front = data;
            }
            list.add(data);
        }

        public void remove(){
            if(isQEmpty()){
                System.out.println("queue is empty.!");
                return;
            }

            int data = list.remove(0);

            if (!isQEmpty()) {
                front = list.get(0);
            }
            System.out.println("remove data is " + data);

        }

        public void printQ(){
            for(int i = 0; i < list.size(); i++){
                System.out.print(list.get(i) + " ");
            }
        }
    }
 
    public static void main(String args[]) {
        Q queuue = new Q();

        queuue.AddQ(1);
        queuue.AddQ(2);
        queuue.AddQ(3);
        queuue.AddQ(4);
        queuue.AddQ(5);
        queuue.AddQ(6);
        queuue.remove();
        queuue.remove();
        queuue.AddQ(7);
        queuue.printQ();
        // System.out.println(queuue.front);
        
    }
}