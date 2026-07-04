public class thief_police {
    public static void main(String[] args) {
        char arr[] = {'P', 'T', 'T', 'P', 'T', 'T', 'T', 'P', 'T'};

        int count = 0;

        int j = 0;
        int k = 0;
        int Pidx = -1;
        int Tidx = -1;

        // Find First Police and Thief 
        for(int i = 0; i < arr.length; i++){
            if(j == 0 && arr[i] == 'P'){
                j = -1;
                Pidx = i;
            } 
            else if (k == 0 && arr[i] == 'T'){
                k = -1;
                Tidx = i;
            }
            else if (k == -1 && j == -1){
                break;
            }
        }

        System.out.println(Pidx + " " + Tidx);
    }
}
