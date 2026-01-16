import java.util.*;

public class LinearSr {
    public static int linearsr(int marks[], int key) {

        for (int i = 0; i < marks.length; i++) {
            if(marks[i] == key){
                return i;
            }
        }

        return 0;
    }

    public static void main(String args[]) {
        int marks[] = {2, 4, 6, 8, 1, 12, 45, 45, 78};
        int key = 10;

        int index = linearsr(marks, key);

        if(index != 0){
            System.out.print("Key is present at index at : ");
            System.out.print(index);
        } else {
            System.out.println("Key is not present");
        }
    }
}