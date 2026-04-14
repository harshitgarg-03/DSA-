

public class Substring {
    public static void printSubstrings(String str, int start, int end) {
    if (start == str.length()) return;
    if (end == str.length()) {
        printSubstrings(str, start + 1, start + 1);
        return;
    }

    String newstr = str.substring(start, end + 1);
    if(newstr.charAt(0) == newstr.charAt(newstr.length()-1)){
        System.out.println(newstr);
    }
    printSubstrings(str, start, end + 1);
}
    public static void main(String args[]) {

        printSubstrings("aba", 0,0); 
    }
}