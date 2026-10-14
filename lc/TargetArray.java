package lc;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetArray {
    public void createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            list.add(index[i],nums[i]);
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        TargetArray t=new TargetArray();
        int nums[]={0,1,2,3,4};
        int index[]={0,1,2,2,1};
        t.createTargetArray(nums,index);
    }
}
