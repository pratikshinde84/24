import java.util.Stack;

public class koko {
    public int minEatingSpeed(int[] piles, int h) {
        int max=piles[0];
        for(int i:piles){
            max=Math.max(i,max);
        }
        int ans=0;
        int start=0,end=max;
        while(start<=end){
            int mid=start+(end-start)/2;
            System.out.println("for k="+mid+" result is "+can(piles,h,mid));
            if(can(piles,h,mid)){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
    boolean can(int piles[],int h,int k){
        int count=0;
        for(int i:piles){
            int ans=(int)Math.ceil((double)i/k);
            count+=ans;
        }
        return count<=h;
    }
    int getSquare(int n){
        int square=0;
        while(n>0){
            int dig=n%10;
            square+=dig*dig;
            n/=10;
        }
        return square;
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stk=new Stack<>();
        for(String s:tokens){
            if(s.equals("+")){
                int second=stk.pop();
                int first=stk.pop();
                stk.push(second+first);
            }else if(s.equals("-")){
                int second=stk.pop();
                int first=stk.pop();
                stk.push(first-second);
            }else if(s.equals("*")){
                int second=stk.pop();
                int first=stk.pop();
                stk.push(second*first);
            }else if(s.equals("/")){
                int second=stk.pop();
                int first=stk.pop();
                stk.push(first/second);
            }else{
                stk.push(Integer.parseInt(s));
            }
        }
        return stk.peek();
    }

    public static void main(String[] args) {
        koko k=new koko();
        System.out.println(k.evalRPN(new String[]{"4","13","5","/","+"}));
    }
}
