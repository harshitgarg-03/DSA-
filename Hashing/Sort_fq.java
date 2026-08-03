
import java.util.HashMap;

public class Sort_fq {
    public static void main(String[] args) {
        String str = "cccaaa";
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (hm.containsKey(ch)) {
                hm.put(ch, hm.getOrDefault(ch, 1) + 1);
            } else {
                hm.put(ch, 1);
            }
        }

        System.out.println(hm);
    }
}
