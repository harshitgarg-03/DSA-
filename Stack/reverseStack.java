import java.util.Stack;

public class reverseStack {

    public static void PushatLow(Stack<Integer> s, int data, int elem){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        
        elem = s.pop();
        PushatLow(s, data, elem);
        s.push(elem);
    }

    public static void PushhingLow(Stack<Integer> s, int elem){
        if(s.isEmpty()){
            return;
        }
        
        elem = s.pop();
        PushhingLow(s, elem);
        PushatLow(s, elem, -1);
    }
     public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(6);
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println(s);
        PushhingLow(s, -1);
        System.out.println(s);
    }
}
