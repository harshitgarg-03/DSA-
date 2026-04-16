public class MergeSort {

    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void MergeArr(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = (si + (ei - si) / 2);
        MergeArr(arr, si, mid);
        System.out.println(arr);
        MergeArr(arr, mid + 1, ei);
        System.out.println(arr);
    }

    public static void MergeSortArr(int arr[], int si, int ei) {

    }

    public static void main(String args[]) {
        int arr[] = { 9, 3, 5, 6, 8, 1 };
        MergeArr(arr, 0, arr.length - 1);
    }
}