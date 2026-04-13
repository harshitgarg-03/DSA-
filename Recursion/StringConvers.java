import java.util.ArrayList;

public class StringConvers {
    public static void stringConvert(String num, int i, ArrayList<String> arr) {
        if (i == num.length()) {
            System.out.println("String is " + arr);
            return;
        }

        String numbersInWords[] = {
                "zero",
                "one",
                "two",
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine"
        };
        
        arr.add(numbersInWords[num.charAt(i)]);
        stringConvert(num, i+1, arr);
    }

    public static void main(String args[]) {
        // Arra String arr[] = {};
        ArrayList<String> arr = new ArrayList<>();
        stringConvert("925", 0, arr);
    }
} 