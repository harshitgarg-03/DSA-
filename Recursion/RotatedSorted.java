import java.util.*;

public class RotatedSorted {
    public static int targetidx(int arr[], int si, int ei, int target) {
        if (si > ei) {
            return -1;
        }

        int mid = (si + (ei - si) / 2);
        if (arr[mid] == target) {
            return mid;
        } else if (arr[si] <= arr[mid]) {
            if (arr[si] <= target && target <= arr[mid]) {
                return targetidx(arr, si, mid - 1, target);
            } else {
                return targetidx(arr, mid + 1, ei, target);
            }
        } else {
            if (arr[mid] <= target && target <= arr[ei]) {
                return targetidx(arr, mid + 1, ei, target);
            } else {
                return targetidx(arr, si, mid - 1, target);
            }
        }

    }

    public static void main(String args[]) {
        int arr[] = { 3, 4, 5, 6, 7, 0, 1, 2 };
        int target = 2;
        int taridx = targetidx(arr, 0, arr.length - 1, target);
        System.out.println("target idx at " + taridx);
    }
}