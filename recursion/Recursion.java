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

    public static void main(String[] args) {
        new Recursion().oneton(5);
        int ar[]={1,2,3,4,5,6};
        new Recursion().reverse(ar.length-1,0,ar);
        System.out.println(Arrays.toString(ar));
    }
}