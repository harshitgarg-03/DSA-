
import java.util.Arrays;
import java.util.Collections;


public class CHocola_Problem {
    public static void main(String args[]) {
        int m = 3;
        int n = 2;

        Integer hc[] = {1, 3}; // horizon cuts 
        Integer vc[] = {5}; // vertical cuts 

        int cost = 0;
        int pieces = 0; // total piece 
        int vp = 1; // vertical piece 
        int hp = 1; // horizontal piece 

        Arrays.sort(hc, Collections.reverseOrder());
        Arrays.sort(vc, Collections.reverseOrder());

        int i = 0;
        int j = 0;

        while(pieces < m*n && (i < hc.length || j < vc.length)){
            if(hc[i] >= vc[j]){
                hp++;
                cost += (hc[i]*vp);
                i++;
            }else {
                vp++;
                cost += (vc[i]*hp);
                j++;
            }
            pieces = hp*vp;
        }

        System.out.println("cost is :: "+ cost);
    }
}