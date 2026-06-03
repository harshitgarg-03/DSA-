public class KeypadCombo {

    public static void solve(String digits, String ans, int idx, String mapping[]) {
        if(ans.length() >= digits.length()){
            System.out.print(ans + " ");
            return;
        }

        int num = (digits.charAt(idx) - '0');
        String value = mapping[num];

        for(int i = 0; i < value.length(); i++){
            ans += value.charAt(i);
            solve(digits, ans, idx+1, mapping);
            ans = ans.substring(0, idx) + ans.substring(idx+1);
        }
    }

    public static void main(String args[]) {
        String digits = "23";
        String ans = "";
        int idx = 0;
        String[] mapping = {
                "", // 0
                "", // 1
                "abc", // 2
                "def", // 3
                "ghi", // 4
                "jkl", // 5
                "mno", // 6
                "pqrs", // 7
                "tuv", // 8
                "wxyz" // 9
        };
        if(digits.length() == 0){
            System.out.println("no digits length");
            return;
        }
        solve(digits, ans, idx, mapping);
    
    }
}