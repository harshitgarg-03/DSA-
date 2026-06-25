import java.util.Stack;

public class histogram {

    public static int[] nextSmaller(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            ans[i] = st.isEmpty() ? arr.length : st.peek();

            st.push(i);
        }

        return ans;
    }

     public static int[] prevSmaller(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            ans[i] = st.isEmpty() ? -1 : st.peek();

            st.push(i);
        }

        return ans;
    }
    public static void main(String[] args) {

        int height[] = {2,1,5,6,2,3};
        int nextArr[] = nextSmaller(height);
        int prevArr[] = prevSmaller(height);

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < height.length; i++){
            int width = (nextArr[i] - prevArr[i]-1);

            int ht = height[i];

            max = Math.max(max, width*ht);
        }

        System.out.println("max area is " + max );
    }
}
