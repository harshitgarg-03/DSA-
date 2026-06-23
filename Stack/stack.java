
import java.util.ArrayList;
import java.util.LinkedList;

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

    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    public static Node tail = null;


    public static class stackUsingLinkelist {
        LinkedList<Integer> ll = new LinkedList<>();

        public static 

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