
public class BinaryString {
    public static void PrintBianry(int term, int lastPlace, String str) {
        if (term == 0) {
            System.out.println(str);
            return;
        }

        PrintBianry(term - 1, 0, str + "0");

        if (lastPlace == 0) {
            PrintBianry(term - 1, 1, str + "1");
        }
    }

    public static void main(String args[]) {
        PrintBianry(3, 0, "");
    }
}