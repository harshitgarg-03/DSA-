import java.util.*;

public class StringCompression {
    public static void main(String args[]) {
        String str[] = {"a","b","b","b","b","b","b","b","b","b","b","b","b"};

        ArrayList<String> newstr = new ArrayList<>();
        Integer count = 1;

        if(str.length == 1){
            System.out.println(str[0]);
            return;
        }

        for (int i = 0; i < str.length - 1; i++) {
            if (str[i] != str[i + 1]) {
                if (count == 1) {
                    newstr.add(str[i]);
                } else {
                    newstr.add(str[i]);
                    newstr.add(String.valueOf(count));
                    count = 1;
                }
            }

            else if ((i == str.length - 2) && (str[i] == str[i + 1])) {
                newstr.add(str[i]);
                newstr.add((++count).toString());
            } else {
                count++;
            }
        }

        for (int i = 0; i < newstr.size(); i++) {
            System.out.print(newstr.get(i) + " ");
        }
        System.out.println();
        System.out.println("Size of a list is : " + newstr.size());
    }
}