import java.util.*;

public class BinarySr {
    public static int BinarySearching(int marks[], int key) {
        int start = marks[0];
        int end = marks.length - 1;

        int mid = start + (end - start) / 2;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (key > marks[mid]) {
                start = mid + 1;
            }

            else if (key < marks[mid]) {
                end = mid - 1;
            }

            else {
                if (key == marks[mid]) {
                    System.out.println("Key found at index : " + mid);
                    return mid;
                } else {
                    System.out.println("no key found !");
                }
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int marks[] = { 2, 4, 6, 8, 10, 10, 12, 16, 18 };
        int key = 12;

        int index = BinarySearching(marks, key);
        if(index == -1){
            System.out.println("key not found !");
        }
    }
}
