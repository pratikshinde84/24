package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Recursion {
    void oneton(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        oneton(n-1);
    }

    void reverse(int end,int start,int ar[]){
        if(start>end){
            return;
        }
        int temp=ar[start];
        ar[start]=ar[end];
        ar[end]=temp;
        reverse(--end,++start,ar);
    }

    public String restoreString(String s, int[] indices) {
        int n=indices.length;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(indices[j]==i){
                    sb.append(s.charAt(j));
                    break;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(new Recursion().restoreString("codeleet",new int[]{4,5,6,7,0,2,1,3}));
    }
}