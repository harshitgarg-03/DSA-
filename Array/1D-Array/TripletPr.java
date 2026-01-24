import java.util.*;

public class TripletPr {
// extract 3 sum without using hasging algorithm..
    public static void findtriplet(int marks[]) {

        if (marks.length < 3) {
            System.out.println("Array length not exist for triplet..!");
            return;
        }

        Arrays.sort(marks);
        int n = marks.length;

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && marks[i] == marks[i - 1])
                continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = marks[i] + marks[left] + marks[right];

                if (sum < 0) {
                    left++;
                }

                else if (sum > 0) {
                    right--;
                }

                else {

                    List<Integer> a = new ArrayList<>();
                    a.add(marks[i]);
                    a.add(marks[left]);
                    a.add(marks[right]);

                    list.add(a);

                    while (left < right && marks[left] == marks[left + 1])
                        left++;

                    while (left < right && marks[right] == marks[right - 1])
                        right--;

                    left++;
                    right--;
                }
            }
        }

        System.out.println(list);
    }

    public static void main(String args[]) {

        int marks[] = { -1, 0, 1, 2, -1, -4 };

        findtriplet(marks);
    }
}
