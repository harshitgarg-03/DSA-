
public class DuplicateStr {
    public static void UniquePtr(String str, int i, StringBuilder newstr) {
        if (i == str.length()) {
            System.out.println("Original string is " + newstr);
            return;
        }
        char ch = str.charAt(i);

        if (newstr.indexOf(String.valueOf(ch)) == -1) {
            newstr.append(ch);
        }
        UniquePtr(str, i + 1, newstr);

    }

    public static void main(String args[]) {
        String str = "appnnacollege";

        UniquePtr(str, 0, new StringBuilder());
    }
}