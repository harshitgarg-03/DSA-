
import java.util.Arrays;

public class Max_length_pair_chain {
    public static void main(String[] args) {
        // Integer arr[][] = { { 1, 2 }, { 2, 3 }, { 3, 4 } };

        int arr[][] = { { 1, 2 }, { 7, 8 }, { 4, 5 } };

        Integer IdxArr[] = new Integer[arr.length];

        for (int i = 0; i < arr.length; i++) {
            IdxArr[i] = i;
        }

        int count = 1;
        Arrays.sort(IdxArr, (a, b) -> arr[a][1] - arr[b][1]);

        // System.out.println("Array idx is :: " + Arrays.toString(IdxArr));

        int lastIdx = arr[IdxArr[0]][1];

        for(int i = 0; i < IdxArr.length-1; i++){
            int n = IdxArr[i+1];

            if(lastIdx < arr[n][0]){
                count++;
                lastIdx = arr[n][1];
            }
        }
        
        System.out.println("count is :: " + count);

    }
}
