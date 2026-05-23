
public class StringConvers {
    public static void stringConvert(String num, int i) {
        if (i == num.length()) {
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

        int digit = (num.charAt(i) - '0');
        System.out.print(numbersInWords[digit]);
        stringConvert(num, i + 1);
    }

    public static void main(String args[]) {
        stringConvert("925", 0);
    }
}