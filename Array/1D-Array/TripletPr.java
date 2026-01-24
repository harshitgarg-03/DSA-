import java.util.*;

public class TripletPr {

    public static void findtriplet(int marks[]) {

        if (marks.length < 3) { // BASE CASE...
            System.out.println("Array length not exist for triplet..!");
            return;
        }
        List<List<Integer>> list = new ArrayList<>();
        int n = marks.length;
        Arrays.sort(marks);

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            if (i > 0 && marks[i] == marks[i-1]) { // BaseCase
                continue;
            }

            while (left < right) {
                int sum = marks[left] + marks[right] + marks[i];

                if (left < right && marks[left] == marks[left + 1]) { // BaseCase
                    left++;
                    continue;
                }
                if (left < right && marks[right] == marks[right - 1]) { // BaseCase
                    right--;
                    continue;
                }
                if (sum < 0) {
                    left++;
                    continue;
                }
                if (sum > 0) {
                    right--;
                    continue;
                }
                if (sum == 0) {
                    List<Integer> a = new ArrayList<>();
                    a.add(marks[left]);
                    a.add(marks[right]);
                    a.add(marks[i]);
                    list.add(a);
                }

            }

        }

        System.out.println(list);

    }

    public static void main(String args[]) {
        int marks[] = {-1, 0, 1, 2, -1, -4 };

        findtriplet(marks);
    }
}
