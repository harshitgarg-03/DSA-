import java.util.*;

public class BuySell {
    public static int ProfitingCalculate(int marks[]) {
        int mp = 0;
        int Bp = marks[0];
        int profit = 0;
        for(int i = 1; i < marks.length; i++){
            if(Bp < marks[i]){
                profit = marks[i] - Bp;
                mp = Math.max(mp, profit);
                // Bp = marks[i];
            } else {
                Bp = marks[i];
            }
        }

        return mp;
    }
    public static void main(String args[]) {
        int marks[] = {7,6,4,3,1};

        int maxprofit = ProfitingCalculate(marks);

        System.out.println("Maximum Profit is : " + maxprofit);
    }
}
