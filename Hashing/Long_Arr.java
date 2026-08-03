
import java.util.Arrays;


// import java.util.*;

// // longest subaaray with sum 0
// public class Long_Arr {
//     public static void main(String[] args) {
//         int arr[] = { -31, -48, -90, 54, 20, 95, 6, -86, 22 };
//         int sum = 0;
//         int len = 0;

//         HashMap<Integer, Integer> hm = new HashMap<>();

//         for (int j = 0; j < arr.length; j++) {
//             sum += arr[j];

//             if (hm.containsKey(sum)) {
//                 len = Math.max(len, j - hm.get(sum));
//             } else {
//                 hm.put(sum, j);
//             }
//         }

//         System.out.println("longets subarray is :: " + len);
//     }

// }
public class Long_Arr {
    public static void main(String args[]) {
        int arr[] = {94, -33, -13, 40, -82, 94, -33, -13, 40, -82};
        int newARr[] = new int[arr.length];
        int k = 52;
        int len = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            newARr[i] = sum+=arr[i];
        }
        System.out.println(Arrays.toString(newARr));

        for(int i = newARr.length-1; i >= 0; i--){
            if(newARr[i] == k){
                len = i+1;
                break;
            }
        }

        System.out.println("max lenght is :: " + len);
    }
}