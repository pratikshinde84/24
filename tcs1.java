import java.util.*;

public class tcs1 {
    boolean containsDuplicate(int ar[]){
        HashSet<Integer> set=new HashSet<>();
        for(int i:ar){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }
    int [] twoSum(int ar[],int target){
        int n=ar.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(target-ar[i])) {
                return new int[]{map.get(target - ar[i]),i};
            }
            map.put(ar[i],i);
        }
        return new int[]{-1,-1};
    }
    static void print(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Krupaya integer enter kara :");
        if(sc.hasNextInt()){
            int a=sc.nextInt();
            System.out.println("Tumhi enter kela ahe :"+a);
        }else{
            System.out.println("Aai ghal na mc nit");
        }
    }
    static void sbl(){
        String a="pratik";
        StringBuilder sb=new StringBuilder(a);
        a="shinde";
        System.out.println(sb);
    }

    static public String encode(@org.jetbrains.annotations.NotNull String arr[]) {
        String ans="";
        for(String s:arr){
            ans+=s.length()+"/:"+s;
        }
        System.out.println(ans);
        decode(ans);
        return ans;
    }
    static public ArrayList<String> decode(String s) {

        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            int digit=s.charAt(i)-'0';
            list.add(s.substring(i+3,i+digit+3));
            i+=digit+2;
        }
        System.out.println(list);
        return list;
    }
    public static void main(String[] args) {
        tcs1 t=new tcs1();
        encode(new String[]{"b4aUljwFRv", "mhZhygJ", "nshZ Z8!" ,"VvDoI0rmw"});
    }
}
