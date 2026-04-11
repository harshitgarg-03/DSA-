public class FindOccurenceElement {
    public static void FindOccur(int arr[],int key, int i) {
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.println("occurence of key at index" + i);
        }
        FindOccur(arr, key, i+1);
    }
    public static void main(String args[]) {
        int arr[] = {1, 4, 1, 2, 4, 5, 5, 1, 7, 8, 4, 7};
        FindOccur(arr, 7, 0);
    }
}