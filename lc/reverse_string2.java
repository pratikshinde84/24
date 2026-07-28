package lc;

public class reverse_string2 {
    public String reverseStr(String s, int k) {
        char ar[]=s.toCharArray();
        int n=ar.length;
        int r=n/(2*k);
        for(int i=0;i<r;i++){
            int start=(k*2)*i;
            int end=start+k-1;
            while(start<end){
                char a=ar[start];
                ar[start]=ar[end];
                ar[end]=a;
                start++;
                end--;
            }
        }//bacdfeg
        int i=r*(2*k);
        if(n-i<k){
            int start=i;
            int end=n-1;
            while(start<end){
                char a=ar[start];
                ar[start]=ar[end];
                ar[end]=a;
                start++;
                end--;
            }
        }else{
            int start=i;
            int end=i+k-1;
            while(start<end){
                char a=ar[start];
                ar[start]=ar[end];
                ar[end]=a;
                start++;
                end--;
            }
        }
        StringBuilder ans=new StringBuilder();
        for(char c:ar){
            ans.append(c);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(new reverse_string2().reverseStr("abcdefg",2));
    }
}
