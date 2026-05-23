// printinng the sum of number 
public class Printnum {
    public static int Printingnum(int num) {
        if (num >= 0){
            return num + Printingnum(num -1);
        }
        return 0;
    }
    public static void main(String args[]) {
        int num = 10;
        int sum = Printingnum(num);
        System.out.println("Sum of the number is :"+ sum);
    }
}
