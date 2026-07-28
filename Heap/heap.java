
import java.util.ArrayList;

public class heap {

    static class Heap {
        ArrayList<Integer> list = new ArrayList<>();

        public void Add(int data) {
            list.add(data);

            int childIdx = list.size() - 1;
            int parIdx = (childIdx - 1) / 2;

            while (!(list.get(childIdx) >= list.get(parIdx))) {// o(log(n))
                int temp = list.get(childIdx);

                list.set(childIdx, list.get(parIdx));
                list.set(parIdx, temp);
            }

        }

        public int Peek() {
            return list.get(0);
        }

        public void Remove() {

            int data = list.get(0);
            list.set(0, list.get(list.size() - 1));
            list.set(list.get(list.size() - 1), data);

            list.remove(list.size() - 1);

            heapify(0);

        }
    }

    public static void main(String args[]) {

    }
}