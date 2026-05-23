
public class Printnumbers {


    // INCREASING ORDER
    public static void printnum(int num) {
        if (num == 0){
            return;
        }
        
        printnum(num - 1);
        System.out.println(num + " ");
    }
    
    // DECREASING ORDER
    // public static void printnum(int num) {
    //     if (num == 0){
    //         return;
    //     }
    //     System.out.println(num + " ");
    //     printnum(num - 1);
    // }
    public static void main(String args[]) {
        int num = 10;
        printnum(num);
    }
}