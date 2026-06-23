
import java.util.ArrayList;

public class stack {

    public static class stackUsingArrlist {
        ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty() {
            return list.isEmpty();
        }

        public void push(int data) {
            list.add(data);
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }

            int data = list.get(list.size() - 1);
            list.remove(list.size() - 1);

            return data;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }

            return list.get(list.size() - 1);
        }

    }

    public static void main(String args[]) {
        stackUsingArrlist stack = new stackUsingArrlist();

        stack.push(3);
        stack.push(2);
        stack.push(1);

        while (!stack.isEmpty()) { 
            System.out.println(stack.pop());
        }

        System.out.println(stack.isEmpty());
    }
}