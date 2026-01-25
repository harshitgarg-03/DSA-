import java.util.*;

public class Bubble {

    public static void bubbleSort(int arr[]) {
        int p = 1;
        while (p < arr.length) {
            int didswap = 0;
            for (int i = 0; i < arr.length - p; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tepm = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tepm;
                    didswap = 1;
                }
            }
            if(didswap == 0){
                break;
            }
            p++;
        }
        
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }
        
    }

    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        bubbleSort(arr);
    }
}
