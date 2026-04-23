import java.util.*;

public class MajorityElem {
    public static void Major(int arr[], int fix, int i, int count) {
        if (i > arr.length - 1) {
            if (count >= (arr.length - 1 / 2)) {
                System.out.println("majority elemnet is " + fix);
            } else {
                System.out.println("majority elemnet not found "+ count);
            }
            return;
        }

        if (arr[i] == fix) {
            count++;
        }
        Major(arr, fix, i+1, count);
    }
         
    public static void main(String args[]) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2, 2 };
        Major(arr, arr[0], 1, 1);
    }
}        