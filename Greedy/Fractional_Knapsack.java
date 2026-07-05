import java.util.Arrays;

public class Fractional_Knapsack {
    public static void main(String[] args) {
        Integer val[] = { 60, 100, 120 };
        Integer wt[] = { 10, 20, 30 };

        Integer IdxArr[] = new Integer[val.length];
        for(int i = 0; i < val.length; i++){
            IdxArr[i] = i;
        }

        Arrays.sort(
                IdxArr,
                (a, b) -> Double.compare(
                        (double) val[b] / wt[b],
                        (double) val[a] / wt[a]));
        
        System.out.println("list is :: " + Arrays.toString(IdxArr));

    }
}
