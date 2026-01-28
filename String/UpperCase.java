import java.util.*;

public class UpperCase {

    public static void convertUppercase(String str) {
        // Splitting
        String arr[] = str.split(" ");

        // Traversing
        for (String word : arr) {
            char oldch = word.charAt(0);
            char newch = Character.toUpperCase(oldch);
            word.replace(oldch, newch);
        }
    }

    public static void main(String args[]) {
        String str = "i am a harshit garg ";

        convertUppercase(str);
    }
}