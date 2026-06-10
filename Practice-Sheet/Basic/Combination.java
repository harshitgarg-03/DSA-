
import java.util.ArrayList;
import java.util.Arrays;

public class Combination {

    public static void solve(int arr[], int target, int i, ArrayList<Integer> list) {
        if(i == arr.length){
            return;
        }

        list.add(arr[i]);
    
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        ArrayList<Integer> Dlist = new ArrayList<>();

        if(arr[i] == target) {
            System.out.println(arr[i] + "");
        }
        while(sum < target){

            for (int index = i+1; index < arr.length; index++) {
                if(sum + arr[index] == target){
                    System.out.println(list + ", " + arr[index]);
                }
            }
        }


    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 6, 7};
        int target = 7;
        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(arr);
        solve(arr, target, 0, list);
    }
}
