
import java.util.Stack;

public class reverseString {

    public static void changeString(Stack <Character> s, String str){
        if(s.isEmpty()){
            System.out.println("reverse string is  " + str);
            return;
        }

        char ch = s.pop();

        str += ch;
        changeString(s, str);
    }
    public static void main(String[] args) {
        Stack <Character> s = new Stack<>();
        s.push('a');
        s.push('b');
        s.push('c');

        System.out.println("string is "+ s);
        changeString(s, "");
    }
}
