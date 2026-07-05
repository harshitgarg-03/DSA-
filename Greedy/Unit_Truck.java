
import java.util.Arrays;

public class Unit_Truck {
    public static void main(String[] args) {
        Integer boxTypes[][] = { { 5, 10 }, { 2, 5 }, { 4, 7 }, { 3, 9} };

        Integer truckSize = 10;
        int unit = 0;

        Integer IdxArr[] = new Integer[boxTypes.length];

        for (int i = 0; i < IdxArr.length; i++) {
            IdxArr[i] = i;
        }

        Arrays.sort(IdxArr,(a, b) -> boxTypes[b][1] - boxTypes[a][1]);
        System.out.println(Arrays.toString(IdxArr));
        for(int i = 0; i < boxTypes.length; i++){
            if(boxTypes[IdxArr[i]][0] <= truckSize){
                unit += boxTypes[IdxArr[i]][0]* boxTypes[IdxArr[i]][1];
                truckSize = truckSize - boxTypes[IdxArr[i]][0];
            }else {
                unit += truckSize*boxTypes[IdxArr[i]][1];
                break;
            }
        }

        System.out.println("max unit is :: "+ unit );
    }
}
