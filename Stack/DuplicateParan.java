import java.util.Stack;

public class DuplicateParan {
    public static void main(String[] args) {
        String str = "(a+b)";
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

                if(!(s.peek() == '(' && active == 1)){
                    System.out.println("duplicate ");
                    return;
                }
                s.pop();
                active = 0;
            }
        }

        System.out.println("not duplicate ");
    }
}
