import java.util.*;

public class CountLowercaseCharcter {
    public static void main(String args[]) {
        String str = "I am Harshit Garg";
        int count = 0;

        for ( int i = 0; i < str.length(); i++){

            if(str.charAt(i) >= 97){
                count++;
            }
        }
        System.out.println(count);
        System.out.println((str.charAt(0)));
    }
}