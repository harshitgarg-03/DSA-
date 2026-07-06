
import java.util.Arrays;
import java.util.Collections;

public class CHocola_Problem {
    public static void main(String args[]) {
        int m = 3;
        int n = 2;

        Integer hc[] = { 7}; // horizon cuts
        Integer vc[] = { 4 }; // vertical cuts

        int cost = 0;
        int pieces = 0; // total piece
        int vp = 1; // vertical piece
        int hp = 1; // horizontal piece

        Arrays.sort(hc, Collections.reverseOrder());
        Arrays.sort(vc, Collections.reverseOrder());

        int i = 0;
        int j = 0;

        while (i < hc.length && j < vc.length) {
            if (hc[i] >= vc[j]) {
                hp++;
                cost += (hc[i] * vp);
                i++;
            } else {

                vp++;
                cost += (vc[j] * hp);
                j++;

            }
            pieces = hp * vp;
        }

        while (i < hc.length) {
            hp++;
            cost += (hc[i] * vp);
            i++;
            pieces = hp * vp;
        }

        while (j < vc.length) {
            vp++;
            cost += (vc[j] * hp);
            j++;
            pieces = hp * vp;
        }

        System.out.println("cost is :: " + cost);
    }
}