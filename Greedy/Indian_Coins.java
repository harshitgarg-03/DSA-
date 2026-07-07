public class Indian_Coins {
    public static void main(String args[]) {
        int dem[] = {1, 2, 5, 10, 20, 50, 100, 500};
        int value = 12;
        int count = 0;

        for(int i = dem.length-1; i >= 0; i--){
            if(value >= dem[i]){
                System.out.println("notes is "+ dem[i]);
                count++;

                value = value - dem[i];
                i = i+1;
            }
        }

        System.out.println("total count is " + count);
    }
}