
public class first {
    public static void Backtrackfunc(int arr[], int i) {
        if(i == arr.length){
            return;
        }
        arr[i] = i+1;
        System.out.println(arr[i]);
        Backtrackfunc(arr, i+1);
        arr[i] = arr[i] - 2;
        System.out.print(arr[i] + " ");
    }
    public static void main(String args[]) {
        int arr[] = new int[5];
        Backtrackfunc(arr, 0);
        
    }
}