
public class LastOccurence {
    public static int LastOccur(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = LastOccur(arr, key, i + 1);
        if(isFound != -1){
            return isFound;
        }
        if(arr[i] == key){
            return i;
        }
        return -1;
    }

    public static void main(String args[]) {
        int key = 5;
        int arr[] = { 1, 5, 3, 4, 5, 5, 4, 5 };
        int index = LastOccur(arr, key, 0);
        if(index == -1){
            System.out.println("Key not found !");
        } else {
            System.out.println("Key found on last occurence at idx is "+ index);
        }
    }
}