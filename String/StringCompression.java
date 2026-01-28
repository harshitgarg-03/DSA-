import java.util.*;

public class StringCompression {
    public static void main(String args[]) {
        String str[] = {"a","a","b","b","c","c","c"};

        ArrayList<String> newstr = new ArrayList<>();
        Integer count = 1;
        for (int i =0; i < str.length-1; i++){
            if(str[i] != str[i+1]){
                if( count == 1){
                    newstr.add(str[i]);
                } else {
                    newstr.add(str[i]);
                    newstr.add(count.toString());
                    count = 1;
                }
            } else {
                count++;
            }
        }
    }
}