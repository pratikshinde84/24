import java.util.Arrays;
import java.util.Scanner;

public class LC {

    static boolean isPrime(int n){
        if (n <= 1)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;

    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=7;
        int ar[]= {6,4,2,5,1,0,7};
        System.out.println(isPrime(6));
        for(int i=0;i<n;i++){
            int prev=-1;
            for(int j=0;j<n;j++){
                if(!isPrime(ar[j])) {
                    if (prev == -1) {
                        prev = j;
                    } else {
                        if(ar[prev]>ar[j]){
                            int temp=ar[prev];
                            ar[prev]=ar[j];
                            ar[j]=temp;
                        }
                        prev=j;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(ar));
    }
}
