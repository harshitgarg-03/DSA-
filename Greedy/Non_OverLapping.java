
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Non_OverLapping {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        list.add(new ArrayList<>(Arrays.asList(1, 2)));
        list.add(new ArrayList<>(Arrays.asList(5, 10)));
        list.add(new ArrayList<>(Arrays.asList(18, 35)));
        list.add(new ArrayList<>(Arrays.asList(40, 45)));

        Collections.sort(list, (a, b) -> a.get(1) - b.get(1));
        int lastIdx = list.get(0).get(1);
        int count = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).get(0) >= lastIdx && list.get(i).get(1) > lastIdx) {
                lastIdx = list.get(i).get(1);
            } else {
                System.out.println("non overlapping pair " + list.get(i));
                count++;
            }
        }

        System.out.println("Non overlapping count is :: " + count);
    }
}
