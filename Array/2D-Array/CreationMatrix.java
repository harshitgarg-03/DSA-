import java.util.*;

// Construct matrix and applying some basic 
// operations (finding, searching, largestfind. smalledtfinds)

public class CreationMatrix {

    public static void BuildMatrix(int marks[][]) {
        int n = marks.length;
        int m = marks[0].length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the value in matrix ...");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void SearchingKey(int marks[][], int key) {
        int n = marks.length;
        int m = marks[0].length;
        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
               if(marks[i][j] == key){
                System.out.println("Key found at index is " + "[ " + i + "," + j +" ]");
                return;
               }
            }
        }
        System.out.println("Key not found ");
    }
    public static void LargestElement(int marks[][]) {
        int n = marks.length;
        int m = marks[0].length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
               max = Math.max(max, marks[i][j]);
            }
        }
        System.out.println("Maximum integer is  " + max);
    }

    public static void main(String args[]) {
        int marks[][] = new int[3][3];
        BuildMatrix(marks);
        // SearchingKey(marks, 10);
        LargestElement(marks);
    }
}
