import java.util.Arrays;

public class Cyclic {
    static void sort(int arr[]){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[correct]!=arr[i]){
                int temp=arr[correct];
                arr[correct]=arr[i];
                arr[i]=temp;
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        sort(new int[]{5,3,2,1,4});
    }
}
