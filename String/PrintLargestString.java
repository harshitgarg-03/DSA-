import java.util.*;

public class PrintLargestString {
    public static void main(String args[]) {
        String str[] = {"apple", "banana", "mango"};

        String largest = str[0];

        for (int index = 1; index < str.length; index++) {
            if(largest.compareTo(str[index]) < 0){
                largest = str[index];
            }
        }

        System.out.println("this is largest string along with array of string is : "+ largest);
    }
}