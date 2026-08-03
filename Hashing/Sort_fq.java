
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Sort_fq {
    public static void main(String[] args) {
        String str = "cccaaabbaddddd";
        HashMap<Character, Integer> hm = new HashMap<>();
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        // System.out.println(hm);
        // System.out.println(hm.entrySet());

        ArrayList<Map.Entry<Character, Integer>> list = new ArrayList<>(hm.entrySet());

        list.sort((a, b) -> Integer.compare(b.getValue(), a.getValue()));

        for (Map.Entry<Character, Integer> mp : list) {
            System.out.println(mp.getKey() + " : " + mp.getValue());
            int k = mp.getValue();
            while(k-- > 0){
                newstr += mp.getKey();
            }
        }
        System.out.println("newstr is :: " + newstr);
    }
}
