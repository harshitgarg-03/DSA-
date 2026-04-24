import java.util.*;

public class MajorityElem {
         
    public static void main(String args[]) {
        int arr[] = { 1, 1, 2, 2, 2, 2, 1, 2, 4, 1, 2, 1, 1};
        Arrays.sort(arr);
        // System.out.println(arr.length);
        // System.out.println(arr.length/2);
        System.out.println("major elem is " + arr[(arr.length-1)/2]);
    }
}         