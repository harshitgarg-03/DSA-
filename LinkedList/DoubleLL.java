
public class DoubleLL {

    public static class Node {
        Node prev;
        Node next;
        int data;
        
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void addFirst(int data){
        Node newNOde = new Node(data);
        size++;
        if(head == null){
            head = tail = newNOde;
            return;
        }

        newNOde.next = head;
        head.prev = newNOde;
        head = newNOde;
    }

    public static void PrintLInkedlist() {
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        addFirst(5);
        addFirst(4);
        addFirst(3);
        addFirst(2);
        addFirst(1);
        addFirst(0);
        PrintLInkedlist();
        System.out.println(size);
    }
}
