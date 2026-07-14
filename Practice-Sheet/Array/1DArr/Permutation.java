
import java.util.Arrays;

public class Permutation {

    static void Swap(int arr[], int i, int idx){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }

    public static void All_Pair(int arr[], int idx) {
        if(idx >= arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }

        for(int i = idx; i < arr.length; i++){
            Swap(arr, i, idx);
            All_Pair(arr, idx+1);
            Swap(arr, i, idx);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};

        All_Pair(arr, 0);
    }
}
