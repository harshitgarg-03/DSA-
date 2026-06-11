
import java.util.ArrayList;
import java.util.Arrays;

public class Combination {

    public static void solve(int arr[], int target, int i, ArrayList<Integer> list, int sum) {
        if (i == arr.length || sum > target) {
            return;
        }

        if (sum == target) {
            System.out.println(list);
            return;
        }

        list.add(arr[i]);
        solve(arr, target, i, list, sum + arr[i]);
        list.remove(list.size() - 1);

        solve(arr, target, i + 1, list, sum);
    }

    public static void main(String[] args) {
        int arr[] = { 2};
        int target = 1;
        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(arr);
        solve(arr, target, 0, list, 0);
    }
}
