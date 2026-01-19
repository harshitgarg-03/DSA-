import java.util.*;

public class MaxSubArrSum {
    // with tc => o(n^2).....
    public static int Maxsum(int marks[]) {

        int i = 0;
        int j = i + 1;
        int maxsum = Integer.MIN_VALUE;

        // check length of array
        if (marks.length == 1) {
            return marks[0];
        }
        // checking all elements are -ve ...
        int count = 0;
        for (int k = 0; k < marks.length; k++) {
            if (marks[k] < 0) {
                count++;
            }

        }

        if (count == marks.length) {
            int max = Integer.MIN_VALUE;
            for (int k = 0; k < marks.length; k++) {
                if (marks[k] > max) {
                    max = marks[k];
                }
            }
            return max;
        }
        // -----------------------

        while (i <= marks.length - 1) {
            System.out.println("enter here ");
            int currsum = marks[i];
            while (j < marks.length - 1) {

                currsum += marks[j];
                if (currsum > maxsum) {
                    maxsum = currsum;
                    // System.out.println(currsum);
                } else {
                    // System.out.println(currsum);

                }
                j++;
            }

            if (j == marks.length - 1) {
                currsum += marks[j];
                if (currsum > maxsum) {
                    maxsum = currsum;
                }
                i = i + 1;
                j = i + 1;

            } else {
                return maxsum;
            }

        }

        return maxsum;
    }

    public static void main(String args[]) {
        int marks[] = { 1 };
        // int marks[] = {1, 2, 3, 4};

        int sum = Maxsum(marks);

        System.out.println("Maximum sum of Subarrays is : " + sum);

    }
}
