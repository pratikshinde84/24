package lc;

public class SmallestStable {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length-1;
        int mini[]=new int[n+1];
        int maxi[]=new int[n+1];
        int m=nums[0];
        for(int i=0;i<=n;i++){
            m=Math.max(m,nums[i]);
            maxi[i]=m;
        }
        m=nums[n];
        for(int i=n;i>=0;i--){
            m=Math.min(m,nums[i]);
            mini[i]=m;
        }
        for(int i=0;i<=n;i++){
            if(maxi[i]-mini[i]<=k){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new SmallestStable().firstStableIndex(new int[]{6,4,0,3,9},1));
    }
}
