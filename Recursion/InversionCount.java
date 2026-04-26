import java.util.*;

public class InversionCount {
    public static void FindCount(int arr[], int i, int ei, int count) {
        if(i > ei-1){
            System.out.println("count is " + count);
            return;
        }

        for(int k = ei-1; k > i; k--){
            if(arr[i] > arr[k]) {
                count++;
            }
        }

        FindCount(arr, i+1, ei, count);

    }
    public static void main(String args[]) {
        int arr[] = {4, 1, 3, 9, 0, 2, 5};
        int nums[] = arr.clone();
        Arrays.sort(nums);

        if(Arrays.equals(arr, nums)){
            System.out.println("Inversion count is 0");
            return;
        }
        FindCount(arr, 0, arr.length, 0);
    }
}      