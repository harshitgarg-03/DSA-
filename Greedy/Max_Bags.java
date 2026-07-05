
import java.util.Arrays;

public class Max_Bags {
    public static void main(String[] args) {
        Integer CP[] = {10, 2, 2};
        Integer RK[] = {2, 2, 0};

        int AB = 100;

        int bags = 0;

        Integer IdxArr[] = new Integer[CP.length];

        for(int i = 0; i < IdxArr.length; i++){
            IdxArr[i] = i;
        }

        Arrays.sort(IdxArr, (a,b) -> (CP[a]-RK[a])-(CP[b]-RK[b]));

        System.out.println(Arrays.toString(IdxArr));

        for(int i = 0; i < RK.length; i++){
            int n = IdxArr[i];
            if(CP[n] == RK[n]){
                bags++;
            }else if (AB > 0){
                int req = CP[n] - RK[n];
                if(AB >= req){
                    RK[n] = RK[n] + req;
                    bags++;
                    AB = AB-req;
                }
            }
        }

        System.out.println("Bags are :: " + bags);
    }
}
