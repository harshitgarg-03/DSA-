
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

                childIdx = parIdx;
                parIdx = (childIdx-1)/2;
            }

        }

        public int Peek() {
            return list.get(0);
        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            if (left < list.size() && list.get(minIdx) > list.get(left)) {
                minIdx = left;
            }

            if (right < list.size() && list.get(minIdx) > list.get(right)) {
                minIdx = right;
            }

            if (minIdx != i) {
                int temp = list.get(i);
                list.set(i, list.get(minIdx));
                list.set(minIdx, temp);

                heapify(minIdx);
            }

        }

        public void Remove() {

            int data = list.get(0);
            list.set(0, list.get(list.size() - 1));
            list.set(list.size() - 1, data);

            list.remove(list.size() - 1);

            heapify(0);

        }

        public boolean IsEmpty() {
            return list.size() == 0;
        }
    }

    public static void main(String args[]) {

    }
}