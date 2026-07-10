
import java.util.ArrayList;

public class All_SubArr {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        
        for(int i = 0; i < arr.length; i++){
            ArrayList<Integer> temp = new ArrayList<>();

            if(list.size() >= 1){
                int size = list.size();
                for(int j = 0; j < size; j++){
                    ArrayList<Integer> list1 = new ArrayList<>(list.get(j));

                    if(list1.get(list1.size()-1) == arr[i-1]){
                        list1.add(arr[i]);
                        list.add(list1);
                    }
                }
            }
            temp.add(arr[i]);
            list.add(temp);
        }

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
