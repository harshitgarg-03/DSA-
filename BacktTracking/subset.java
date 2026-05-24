public class subset {
    public static void Findsubset(String str, int i, String sb) {
        if (i == str.length()) {
            if (sb.length() == 0) {
                System.out.println(". ");
                return;
            }
            System.out.println(sb + " ");
            return;
        }

        Findsubset(str, i + 1, sb + str.charAt(i));
        Findsubset(str, i + 1, sb);
    }

    public static void main(String args[]) {
        String str = "abc";
        Findsubset(str, 0, "");
    }
}