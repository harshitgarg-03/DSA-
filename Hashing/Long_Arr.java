
import java.util.*;

public class Long_Arr {
    public static void main(String[] args) {
        int arr[] = { 1, 0, -4, 3, 1, 0 };
        int sum = 0;
        int len = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];

            if (hm.containsKey(sum)) {
                len = Math.max(len, j - hm.get(sum));
            } else {
                hm.put(sum, j);
            }
        }

        System.out.println("longets subarray is :: " + len);
    }
}
