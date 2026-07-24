import java.util.Arrays;

public class Insertion_Sort {
    void insertion(int ar[]){
        for(int i=1;i<ar.length;i++){
            int cur=ar[i];
            int j=i;
            while(j>0&&ar[j-1]>cur){
                ar[j]=ar[j-1];
                j--;
            }
            ar[j]=cur;
        }
        System.out.println(Arrays.toString(ar));
    }
    public static void main(String[] args) {
        new Insertion_Sort().insertion(new int[]{5,4,3,2,1});
    }
}
