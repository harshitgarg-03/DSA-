import java.util.*;

public class SubArr {
    public static void main(String args[]) {
        int marks[] = {2, 4, 6, 8, 10, 12, 14};
        
        for(int i = 0; i < marks.length; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = i; j < marks.length; j++){
                sb.append(marks[j]).append(" ");
                System.out.println(sb.toString());
            }
        }
    }
}
