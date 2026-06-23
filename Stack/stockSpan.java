import java.util.Stack;

public class stockSpan {
    public static void main(String[] args) {
        int price[] = {100, 80, 60, 70, 60, 85, 100};

        int span[] = new int[price.length];

        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for (int i = 1; i < price.length; i++){
            int stockPrice = price[i];

            while(!s.isEmpty()){
                int prevStock = price[s.peek()];
                if(prevStock > stockPrice){
                    span[i] = i-s.peek();
                    s.push(i);
                    break;
                }
                s.pop();
            }

            if(span[i] == 0){
                span[i] = i+1;
            }
        }

        for (int i = 0; i < span.length; i++) {
            System.out.print( span[i] + " ");
        }
    }
}
