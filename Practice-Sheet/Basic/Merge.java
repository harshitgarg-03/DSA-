//  in this inversion count 


public class Merge {

    static int count = 0;

    public static void MergeSort(int arr[], int start, int end){
        // System.out.println(".()");
        if(start >= end){
            return;
        }

        int mid = (start + end)/2;
        // System.out.print(mid + " ");

        MergeSort(arr, start, mid); // Left Merge 

        MergeSort(arr, mid+1, end); // Right Merge 

        InversionCount(arr, start, mid, end);
    }

    public static void InversionCount(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int k = 0;
        int i = si;
        int j = mid + 1;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                count += mid-i+1;
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (i = si, k = 0; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
    
        public static void main(String[] args) {
        int arr[] = {5, 3, 2, 4, 1};

        int start = 0;
        int end = arr.length-1;

        MergeSort(arr, start, end);
        System.out.println("count" + count);
    }
}
