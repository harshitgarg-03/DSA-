
public class CheckArray {
    public static void sorted(int arr[], int i) {
        if (i == arr.length - 1) {
            System.out.println("true");
            return;
        }

        if (arr[i] <= arr[i + 1]) {
            sorted(arr, i+1);
        } else {
            System.out.println("false..");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        sorted(arr, 0);
    }
}