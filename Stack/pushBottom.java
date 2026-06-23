
import java.util.Stack;

public class pushBottom {

    public static void PushhingLow(Stack<Integer> s, int data, int elem){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        
        elem = s.pop();
        PushhingLow(s, data, elem);
        s.push(elem);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        // System.out.println(s);
        PushhingLow(s, 4, -1);
        PushhingLow(s, 5, -1);
        PushhingLow(s, 6, -1);
        System.out.println(s);
    }
}
