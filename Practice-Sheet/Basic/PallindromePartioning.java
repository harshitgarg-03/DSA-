public class PallindromePartioning {

    public static void solve(String str, int idx, String ans) {
        if(idx == str.length()) {
            System.out.println(ans);
            return;
        }

        solve(str, idx + 1,
              ans + str.charAt(idx));

        solve(str, idx + 1,
              ans);

    }
    public static void main(String args[]) {
    solve("aab", 0, "");
    }
}   