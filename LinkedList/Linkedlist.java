
public class Linkedlist {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static Node temp;
    public static int size;

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
        newNode.next = head.next.next.next;
    }

    public static void AddMiddle(int idx, int data) {

        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        temp = head;

        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    public static void removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return;
        } else if (size == 1) {
            head = tail = null;
            size = 0;
        }
        head = head.next;
        size--;
        return;
    }

    public static void removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return;
        } else if (size == 1) {
            head = tail = null;
            size = 0;
        }
        temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
        size--;
    }

    public static void helperFnx(Node head, int key, int idx) {
        if (head == null) {
            System.out.println("key not found ");
            return;
        }
        if (head.data == key) {
            System.out.println("key found at idx " + idx);
            return;
        }
        head = head.next;
        idx = idx + 1;
        helperFnx(head, key, idx);
    }

    public static void recSearch(int key) {
        if (head == null) {
            System.out.println("Linkedlist is empty .!");
            return;
        }

        helperFnx(head, key, 0);
    }

    public static void solve(Node prev, Node curr) {

        if (curr == null) {
            head = prev;
            return;
        }

        Node succ = curr.next;

        curr.next = prev;

        solve(curr, succ);
    }

    public static void reverse(Node head) {

        if (head == null || head.next == null) {
            return;
        }

        tail = head;

        solve(null, head);
    }

    public static void delNnodeEnd(int size, int n) {

        if (size == n) {
            head = head.next;
            return;
        }
        int j = size - n;
        temp = head;

        for (int i = 0; i < j - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        System.out.println("temp " + temp.data);
    }

    public static Node MidNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }

        return slow; // midnode
    }

    public static boolean pallindrome() {
        Node midNOde = MidNode(head); // find midNode

        // reverse half Linkedlist

        Node prev = null;
        Node curr = midNOde;
        Node succ;
        while (curr != null) {
            succ = curr.next;
            curr.next = prev;

            prev = curr;
            curr = succ;
        }
        // now check the right and the left half
        Node right = prev;
        Node left = head;

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static boolean DetectLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void removeCyclewithSize (){
        // with the help of size 
        temp = head;
        for (int i = 1; i < size; i++ ){
            temp = temp.next;
        }
        System.out.println("last node is " + temp.data);
        temp.next = null;
        
    }

    public static void removeCycle() {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                System.err.println("Loop is detected ");

                
            }
        }
    }
    public static void PrintLinkedList() {
        if (head == null) {
            System.out.println();
        }
        temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Linkedlist ll = new Linkedlist();

        addFirst(8);
        addFirst(7);
        addFirst(6);
        addFirst(5);
        addFirst(4);
        addFirst(3);
        addFirst(2);
        addFirst(1);
        addLast(9);
        // addLast(1);

        // AddMiddle(2, 9);
        // removeFirst();
        // removeLast();
        // PrintLinkedList();
        System.out.println("size is :: " + size);
        // recSearch(10);
        // reverse(head);
        // delNnodeEnd(size, 5);
        // PrintLinkedList();
        // System.out.println(pallindrome());
        // System.out.println(tail.next.data);
        // System.out.println(DetectLoop(head));
        removeCyclewithSize();
        PrintLinkedList();
    }
}