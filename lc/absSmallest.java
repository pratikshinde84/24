package lc;

import java.util.Arrays;

public class absSmallest {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min=0,max=0;
        for(int i=0;i<k;i++){
            min+=nums[i];
        }
        for(int i=nums.length-1;i>=nums.length-k;i--){
            max+=nums[i];
        }
        System.out.println(min+" "+max);
        return Math.abs(max-min);
    }

    public static void main(String[] args) {
        absSmallest a=new absSmallest();
        System.out.println(a.absDifference(new int[]{5,2,2,4},2));
    }
}
