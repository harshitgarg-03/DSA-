import java.util.Stack;

public class DuplicateParan {
    public static boolean main(String[] args) {
        String str = "(((a+(b)))+(c+d))";
        Stack<Character> s = new Stack<>();
        int active = 0;

        for (int idx = 0; idx < str.length(); idx++) {
            Character ch = str.charAt(idx);
            if(ch != ')'){
                s.push(ch);
            }else{
                while (s.peek() != '(') { 
                    active = 1;
                    s.pop();
                }

                if(!(s.peek() == ')' && active == 1)){
                    return true;
                }
                active = 0;
            }
        }

        return false;
    }
}
