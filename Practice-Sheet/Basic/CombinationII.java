
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationII {

    public static void Solve(int arr[], int target, ArrayList<Integer> list, int i, int sum, List<List<Integer>> ans) {
        if (i == arr.length || sum > target) {
            // System.out.println(ans);
            return;
        }

        if (sum == target) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int j = i; j < arr.length; j++) {
            if (j > i && arr[j] == arr[j - 1]) {
                continue;
            }
            list.add(arr[j]);
            Solve(arr, target, list, j + 1, sum + arr[j], ans);
            list.remove(list.size() - 1);

        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 1, 2, 7, 6, 1, 5 };
        int target = 8;
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        Solve(arr, target, list, 0, 0, ans);
        System.out.println(ans);
    }
}
