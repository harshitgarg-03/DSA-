public class QuickSort {

    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void SwapFun(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }

    public static void QuikcArr(int arr[], int i, int j, int pv) {
        if (i > arr.length) {
            return;
        }
        if (arr[i] <= pv) {
            ++j;
            SwapFun(arr, i, j);
        }
        QuikcArr(arr, i+1, j, pv);
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        QuikcArr(arr, 0, -1, arr[arr.length-1]);
        PrintArr(arr);
    }
}