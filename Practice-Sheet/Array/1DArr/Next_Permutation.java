import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Next_Permutation {

    static void Swap(int[] arr, int i, int idx) {
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }

    public static void All_Pair(
            int[] arr,
            int idx,
            List<List<Integer>> list) {

        if (idx >= arr.length) {

            List<Integer> temp = new ArrayList<>();

            for (int num : arr) {
                temp.add(num);
            }

            if (!list.contains(temp)) {
                list.add(temp);
            }

            return;
        }

        for (int i = idx; i < arr.length; i++) {

            Swap(arr, i, idx);

            All_Pair(arr, idx + 1, list);

            Swap(arr, i, idx);
        }
    }

    public static void main(String[] args) {

        int[] arr = { 3, 2, 1 };

        List<List<Integer>> list = new ArrayList<>();

        int[] copy = arr.clone();

        Arrays.sort(arr);

        All_Pair(arr, 0, list);

        List<Integer> temp = new ArrayList<>();

        for (int num : copy) {
            temp.add(num);
        }

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).equals(temp)) {

                if (i == list.size() - 1) {
                    System.out.println(list.get(0));
                } else {
                    System.out.println("yes " + i);
                    System.out.println(list.get(i + 1));
                }

                break;
            }
        }
    }
}