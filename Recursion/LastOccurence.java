
public class LastOccurence {
    public static void LastOccur(int arr[], int key, int i) {
        if (i == arr.length) {
            System.out.println("Key not found !");
            return;
        }
        LastOccur(arr, key, i + 1);
        if (arr[i] == key) {
            // System.out.println("Key's first occurence is index " + i);
            return;
        }

    }

    public static void main(String args[]) {
        int key = 4;
        int arr[] = { 1, 5, 3, 4, 5, 5, 4, 5 };
        LastOccur(arr, key, 0);
    }
}