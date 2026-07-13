import java.util.Arrays;

public class long_subSequence {
    public static void main(String[] args) {
        int arr[] = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };

        // int arr[] = { 100, 4, 200, 1, 3, 2 };

        Arrays.sort(arr);
        int count = 1;
        int max_count = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == 0) {
                continue;
            } else if (arr[i + 1] - arr[i] == 1) {
                count++;
            } else {
                max_count = Math.max(max_count, count);
            }
        }

        System.out.println("maximum count is :: " + max_count);
    }
}
