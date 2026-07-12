import java.util.Arrays;

public class Rotate_Img {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = arr.length;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                int elem = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = elem;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
