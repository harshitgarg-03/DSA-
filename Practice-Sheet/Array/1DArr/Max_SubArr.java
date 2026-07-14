public class Max_SubArr {
    public static void main(String[] args) {
        int arr[] = { -2, -1 };

        int sum = 0;
        int count = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            count = Math.max(sum, count);
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println("count is :: " + count);
    }
}
