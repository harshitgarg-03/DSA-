import java.util.*;

public class MergeSort {

    public static void divide(String arr[], int si, int ei) {
        if (si >= ei) return;

        int mid = si + (ei - si) / 2;

        divide(arr, si, mid);     
        divide(arr, mid + 1, ei);

        merge(arr, si, mid, ei);
    }

    public static void merge(String arr[], int si, int mid, int ei) {
        String temp[] = new String[ei - si + 1];

        int left = si;      
        int right = mid + 1; 
        int k = 0;

      
        while (left <= mid && right <= ei) {
            if (arr[left].compareTo(arr[right]) <= 0) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
            }
        }

        
        while (left <= mid) {
            temp[k++] = arr[left++];
        }

        while (right <= ei) {
            temp[k++] = arr[right++];
        }

        for (int i = 0; i < temp.length; i++) {
            arr[si + i] = temp[i];
        }
    }

    public static void main(String args[]) {
        String arr[] = {"sun", "earth", "mars", "mercury"};

        divide(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        for (String num : arr) {
            System.out.print(num + " ");
        }
    }
}