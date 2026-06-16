import java.util.Arrays;

public class Cyclic {
    static int solve(int bt[]) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int ans=0;
        int current=0;
        while(!pq.isEmpty()){
            ans+=current;
            current+=pq.poll();
        }
        return ans/bt.length;
    }
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
