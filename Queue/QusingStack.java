import java.util.Stack;

public class QusingStack {

    public static void adding(Stack<Integer> s1, int data) {
        s1.push(data);
    }

    public static void peeking(Stack<Integer> s1){
        Stack<Integer> s2 = new Stack<>();

         while (!s1.isEmpty()) {
            int data = s1.pop();
            s2.push(data);
        }

        int data = s2.peek();
        System.out.println("peek data is " + data);

        while(!s2.isEmpty()){
            int popdata = s2.pop();
            s1.push(popdata);
        }
    }

    public static void popping(Stack<Integer> s1){
        Stack<Integer> s2 = new Stack<>();

         while (!s1.isEmpty()) {
            int data = s1.pop();
            s2.push(data);
        }

        int data = s2.pop();
        System.out.println("pop data is " + data);

        while(!s2.isEmpty()){
            int popdata = s2.pop();
            s1.push(popdata);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        adding(s1, 1);
        adding(s1, 2);
        adding(s1, 3);
        adding(s1, 4);
        adding(s1, 5);

        peeking(s1);
        popping(s1);
        popping(s1);
        peeking(s1);

        while (!s1.isEmpty()) {
            System.out.print(s1.peek() + " ");
            s1.pop();
        }
        System.out.println();

    }
}
