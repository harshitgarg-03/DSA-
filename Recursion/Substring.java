import java.util.ArrayList;

public class Substring {
    public static void PrintSubstring(String newstr, int i, ArrayList<String> str, StringBuilder sb) {
        if(i == newstr.length()){
            System.out.println("substring are " + str);
            return;
        }

        sb.append(newstr.charAt(i));
        System.out.println(sb+ " ");
        PrintSubstring(newstr, i+1, str, sb);
    }
    public static void main(String args[]) {
        ArrayList<String> str = new ArrayList<>();
        PrintSubstring("abca", 0, str, new StringBuilder());
    }
}