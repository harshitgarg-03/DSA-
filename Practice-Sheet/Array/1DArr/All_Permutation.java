// using extra space 

public class All_Permutation {

    public static void All_Pair(String str, String rstr) {
        if(str.length() == 0){
            System.out.println(rstr);
            return;
        }


        for(int i = 0; i < str.length(); i++){
            Character ch = str.charAt(i);
            String newstr = str.substring(0, i)+ str.substring(i+1);
            All_Pair(newstr, rstr+ch);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        
        All_Pair("123", "");
    }
}
