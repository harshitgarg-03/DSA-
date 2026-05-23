
public class FriendsPair {
    public static int CalculateWays(int n) {
        if(n == 1 || n ==2){
            return n;
        }

        // Single ways
        int singleways = CalculateWays(n-1);

        // paired ways 
        int pairways = CalculateWays(n-2)*(n-1);
        int totalways = (pairways + singleways);

        return totalways;
    }
    public static void main(String args[]) {
        System.out.println("Total ways are " + CalculateWays(3));
    }
}