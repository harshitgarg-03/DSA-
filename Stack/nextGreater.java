
import java.util.Stack;

public class nextGreater {
    public static void main(String[] args) {
        int arr[] = {2, 1, 7, 11, 12, 3, 6, 9};
        int nextG[] = new int[arr.length];
        
        Stack<Integer> s = new Stack<>();

        nextG[arr.length-1] = -1;
        s.push(arr[arr.length-1]);

        for(int i = arr.length-2; i >= 0; i--){
            while(!s.isEmpty()){
                if(s.peek()> arr[i]){
                    nextG[i] = s.peek();
                    s.push(arr[i]);
                    break;
                }
                s.pop();
            }

            if(nextG[i] == 0){
                nextG[i] = -1;
                s.push(arr[i]);
            }
        }

        for (int idx = 0; idx < nextG.length; idx++) {
            System.out.print(nextG[idx] + " ");
        }
    }
}
