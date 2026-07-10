
import java.util.Arrays;

public class Assign_Cookie {
    public static void main(String args[]) {
        int g[] = {1, 2};
        int s[] = {1, 2, 3};

        Arrays.sort(g);
        Arrays.sort(s);

        int count = 0;
        int i = 0;
        int j = 0;

        while(i < g.length && j < s.length){
            if(s[j] >= g[i]){
                count++;
                i++;
                j++;
            }
            else if (g[i] > s[j]) {
                j++;
            }
        }

        System.out.println("Max cookie assign is :: "+ count);
    }
}