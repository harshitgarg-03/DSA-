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
    }

    public static int QuikcArr(int arr[], int i, int j, int end, int pv, int pvidx) {

        if (i > end) {
            return pvidx;
        }

        if (arr[i] <= pv) {
            j++;
            if (arr[i] == pv) {
                pvidx = j;
            }
            SwapFun(arr, i, j);
        }

        return QuikcArr(arr, i + 1, j, end, pv, pvidx);
    }

    public static void mergeArray(int low, int high, int arr[]) {

        if (low < high) {

            int pivot = arr[high - 1];

            int pvidx = QuikcArr(arr, low, low - 1, high - 1, pivot, high - 1);

            mergeArray(low, pvidx, arr);
            mergeArray(pvidx + 1, high, arr);
        }
    }

    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 8, 2, 5};

        mergeArray(0, arr.length, arr);

        PrintArr(arr);
    }
}