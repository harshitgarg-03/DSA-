
import java.util.Arrays;


public class ReArrange_Elem {

    public static void main(String[] args) {
        int arr[] = { 19,-26,-37,-10,-9,15,14,31 };

        int temp[] = new int[arr.length];
        
        int pos = 0;
        int neg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                temp[pos++ * 2] = arr[i];
            } else if (arr[i] < 0) {
                temp[(neg++ * 2) + 1] = arr[i];
            }
        }

        System.out.println(Arrays.toString(temp));
    }
}
