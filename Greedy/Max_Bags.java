
import java.util.Arrays;

public class Max_Bags {
    public static void main(String[] args) {
        Integer CP[] = {2, 3, 4, 5};
        Integer RK[] = {1, 2, 4, 4};

        int AB = 2;

        Integer IdxArr[] = new Integer[CP.length];

        for(int i = 0; i < IdxArr.length; i++){
            IdxArr[i] = i;
        }

        Arrays.sort(IdxArr, (a,b) -> (CP[a]-RK[a])-(CP[b]-RK[b]));

        System.out.println(Arrays.toString(IdxArr));
    }
}
