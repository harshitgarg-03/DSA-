import java.util.*;

public class UpperCase {

    public static void convertUppercase(String str) {
        // Splitting
        String arr[] = str.split(" ");

        String newstr = "";

        // Traversing
        for (String word : arr) {
            char oldch = word.charAt(0);
            char newch = Character.toUpperCase(oldch);
            String newword = word.replaceFirst(String.valueOf(oldch), String.valueOf(newch));

            newstr += newword + " ";
            
        }

        System.out.println(newstr);
    }

    public static void main(String args[]) {
        String str = "i am a harshit garg ";

        convertUppercase(str);
    }
}