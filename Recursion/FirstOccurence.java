
public class FirstOccurence {
    public static void FirstOccur(int arr[], int key, int i) {
        if(i == arr.length-1){
            System.out.println("Key not found !");
            return;
        }
        if(arr[i] == key){
            System.out.println("Key's first occurence is index " + i);
            return;
        }

        FirstOccur(arr, key, i+1);
    }
    public static void main(String args[]) {
        int key = 7;
        int arr[] = {1, 5, 3, 4, 5, 5, 7, 5};
        FirstOccur(arr, key, 0);
    }
}