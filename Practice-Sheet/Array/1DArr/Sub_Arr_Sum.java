// later do it hashing concept using 
import java.util.Arrays;

public class Sub_Arr_Sum {
    public static void main(String[] args) {
        int arr[] = {1,2, 3};
        int pref[] = new int[arr.length];
        int k = 3;
        int count = 0;

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            pref[i] = sum;
        }

        for(int i = 0; i < arr.length; i++){
            int elem = arr[i];
            int find_elem = k-elem;

            if(find_elem == k){
                count++;
            }else {
                
            }
        }

        System.out.println("count is :: " + Arrays.toString(pref));
    }
}
