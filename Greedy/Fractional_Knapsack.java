import java.util.Arrays;

public class Fractional_Knapsack {
    public static void main(String[] args) {
        Integer val[] = {500};
        Integer wt[] = {30};

        int capacity = 10;
        double profit = 0;

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

        for(int i = 0; i < IdxArr.length; i++){
            if(wt[IdxArr[i]] <= capacity){
                profit += val[IdxArr[i]];
                capacity = capacity - wt[IdxArr[i]];
            }else {
                double costPerKg = (double) val[IdxArr[i]] / wt[IdxArr[i]];
                profit += costPerKg*capacity;
                break;
            }
        }

        System.out.printf("Profit = %.6f%n", profit);

    }
}
