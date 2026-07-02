import java.util.Arrays;

public class Activity_Selection {
    public static void main(String[] args) {
        int si[] = {0, 3, 1, 8, 5, 5};
        int ei[] = {6, 4, 2, 9, 7, 9};

        Integer idxArr[] = new Integer[si.length];

        for(int i = 0; i < idxArr.length; i++){
            idxArr[i] = i;
        }

        Arrays.sort(idxArr, (a, b) -> (ei[a] - ei[b]));

        for(int i = 0; i < idxArr.length; i++){
            System.out.print(idxArr[i] + " ");
        }

        int count = 1;
        int lastEnd = ei[idxArr[0]];

        for(int i = 0; i < si.length; i++){
            int idx = idxArr[i];

            if(si[idx] > lastEnd){
                count++;
                lastEnd = idxArr[i];
            }
        }

        System.out.println("max activity is :: " + count);
    }
}
