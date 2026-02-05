import java.util.*;

public class ContainWithMostWater {

    public static void maxwater(int height[]) {
        int n = height.length-1;
        int mid = (n/2);
        int leftIdx = 0;
        int rightIdx = mid+1;
        int leftHt = height[leftIdx];
        int rigthHt = height[mid+1];
        int leftSum = height[0];
        int rightSum = rightIdx+rigthHt;

        for(int i = 0; i <= mid; i++){
            if(leftSum < (i+height[i])){
                leftSum = i+height[i];
                leftIdx = i;
                leftHt = height[i];
            }
        }
        for(int i = mid+1; i <= n; i++){
            if(rightSum <= (i+height[i])){
                rightSum = i+height[i];
                rightIdx = i;
                rigthHt = height[i];
            }
        }

        int maxht = Math.min(leftHt, rigthHt);
        int idx = (rightIdx-leftIdx);
        // System.out.println("idx : " + idx + "maxht is : " + maxht);
        int water = idx*maxht;
        System.out.println("Water is : " + water);

    }
    public static void main(String args[]) {
        int height[] = {3, 1, 2, 4, 5};
        maxwater(height);
    }
}