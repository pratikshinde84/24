import java.util.Arrays;
import java.util.Scanner;

public class Merge_Sort {

    void mergeSort(int low,int high,int ar[]){
        if(low<high){
            int mid=low+(high-low)/2;
            mergeSort(low,mid,ar);
            mergeSort(mid+1,high,ar);
            merge(low,high,mid,ar);
        }
    }

    private void merge(int low, int high, int mid, int[] ar) {
        int n1=mid-low+1,n2=high-mid;
        int right[]=new int[n2];
        int left[]=new int[n1];
        for(int i=0;i<n1;i++){
            left[i]=ar[low+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=ar[mid+j+1];
        }
        int i=0,j=0,k=low;
        while(i<n1&&j<n2){
            if(left[i]<right[j]){
                ar[k++]=left[i++];
            }else{
                ar[k++]=right[j++];
            }
        }
        while(i<n1){
            ar[k++]=left[i++];
        }
        while(j<n2) {
            ar[k++] = right[j++];
        }
    }
    public int removeDuplicates(int[] nums) {
        int left=0,right=0,count=1;
        for(right=0;right<nums.length;right++){
            if(nums[left]!=nums[right]){
                nums[++left]=nums[right];
                count++;
            }
        }
        return count;
    }
    int missingNum(int arr[]) {
        for(int i=0;i<arr.length;i++){
            int corr=arr[i];
            if(arr[i]>=arr.length)continue;
            if(arr[i]!=i+1){
                int temp=arr[i];
                arr[i]=arr[corr-1];
                arr[corr-1]=temp;
                i--;
            }else{
                continue;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return arr.length+1;
    }

    Merge_Sort(int n){

    }

    public static void main(String[] args) {
//        int ar[] = {1};
        Merge_Sort m=new Merge_Sort(2);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char ar[]=new char[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.next().charAt(0);
        }
        System.out.println(Arrays.toString(ar));
    }
}
