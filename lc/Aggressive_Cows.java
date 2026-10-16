package lc;

import java.util.Arrays;

public class Aggressive_Cows {
    public int aggressiveCows(int[] arr, int k) {
        Arrays.sort(arr);
        int n=arr.length;
        int low=0,high=arr[n-1]-arr[low];
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(isValid(arr,mid,low,high,k)){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    boolean isValid(int ar[],int mid,int low,int high,int k){
        int start=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]-ar[start]>=mid){
                k--;
                start=i;
            }
        }
        return k<=1;
    }

    public static void main(String[] args) {
        Aggressive_Cows ag=new Aggressive_Cows();
        int ar[]={1, 2, 4, 8, 9};
        System.out.println(ag.aggressiveCows(ar,3));
    }
}
