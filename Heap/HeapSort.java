public class HeapSort {

    public static void heapify(int arr[], int i, int size) {
        int leftIdx = 2 * i + 1;
        int rigthIdx = 2 * i + 2;

        int maxIdx = i;

        if (leftIdx < size && arr[leftIdx] > arr[maxIdx]) {
            maxIdx = leftIdx;
        }
        if (rigthIdx < size && arr[rigthIdx] > arr[maxIdx]) {
            maxIdx = rigthIdx;
        }

        if (maxIdx != i) {
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr, maxIdx, size);
        }
    }

    public static void HeapSorting(int arr[]) {
        int n = arr.length;

        for (int i = n / 2; i >= 0; i--) { // max HEap
            heapify(arr, i, n);
        }

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }

    }

    public static void main(String[] args) {
        // int arr[] = {1, 2, 4, 5, 3};
        int arr[] = { 4, 1, 3, 9, 7 };

        HeapSorting(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
