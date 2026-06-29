
import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "aabccxb";

        int arr[] = new int[26];
        Queue<Character> q = new LinkedList<>();

        for(int i = 0; i < str.length(); i++){
            char current = str.charAt(i);

            arr[current - 'a']++;
            q.add(current);

            while(!q.isEmpty() && arr[q.peek() - 'a'] > 1){
                q.remove();
            }

           if (q.isEmpty()) {
                System.out.print("# ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
    }
}
