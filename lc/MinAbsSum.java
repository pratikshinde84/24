package lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinAbsSum {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int diff=Math.abs(arr[i]-arr[i+1]);
            min=Math.min(min,diff);
        }
        for(int i=0;i<arr.length-1;i++){
            int diff=Math.abs(arr[i]-arr[i+1]);
            if(diff==min){
                list.add(new ArrayList<>(List.of(arr[i],arr[i+1])));
            }
        }
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {
        new MinAbsSum().minimumAbsDifference(new int[]{4,2,1,3});
    }
}
