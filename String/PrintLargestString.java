import java.util.*;

public class PrintLargestString {
    public static void main(String args[]) {
        String str[] = {"apple", "banana", "mango"};

        String lagrgest = str[0];

        for (int index = 1; index < str.length; index++) {
            if(lagrgest.compareTo(str[index]) > 0){
                lagrgest = str[index];
            }
        }
    }
}