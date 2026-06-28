import java.util.ArrayList;

public class queue {
    // queue implementing using arraylist not an optimal approach
    public static class QusingArraylist {
        ArrayList<Integer> list = new ArrayList<>();

        static int front;

        public boolean isQEmpty() {
            return list.isEmpty();
        }

        public void AddQ(int data) {
            if (isQEmpty()) {
                front = data;
            }
            list.add(data);
        }

        public void remove() {
            if (isQEmpty()) {
                System.out.println("queue is empty.!");
                return;
            }

            int data = list.remove(0);

            if (!isQEmpty()) {
                front = list.get(0);
            }
            System.out.println("remove data is " + data);

        }

        public void printQ() {
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
        }
    }

    // queue implementing using arrays an optimal approach
    public static class QusingArr {
        int arr[] = new int[6];

        int front = -1;
        int rear = -1;
        int n = arr.length;

        public boolean isEmpty() {
            return front == -1;
        }

        public boolean isFull() {
            return (rear + 1 % n == front);
        }

        public void Adding(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (isEmpty()) {
                rear = front = 0;
            } else {
                rear = (rear + 1) % n;
            }

            arr[rear] = data;
        }

        public void removing() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }

            int data = arr[front];
            System.out.println("Removed: " + data);

            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % n;
            }
        }

        public void printQ() {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {

        QusingArr q = new QusingArr();

        // System.out.println(q.isEmpty());

    }
}