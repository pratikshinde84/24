package TCS;

public class Reverse {
    int reverse(int a){
        int rev=0;
        while(a>0){
            int rem=a%10;
            rev=rev*10+rem;
            a/=10;
        }
        return rev;
    }
    int count(int a){
        int count=0;
        while(a>0){
            count++;
            a/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        int a=12345;
        System.out.println(new Reverse().reverse(a));
        
        System.out.println(new Reverse().count(a));
    }
}