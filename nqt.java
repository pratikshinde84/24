import java.util.HashMap;

public class nqt {
    int get(int ar[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i:ar){
            int rem=i%10;
            if(rem==0){
                count++;
                continue;
            }
            int req=10-rem;
            if(map.containsKey(req)&&map.get(req)>0) {
                count++;
                map.put(req, map.get(req) - 1);
                if (map.get(req) == 0) map.remove(req);
            }else if(!map.containsKey(req)){
                map.put(rem,1);
            }
            else{
                map.getOrDefault(rem,map.get(req)+1);
            }
        }
        System.out.println(map);
        return count;
    }
    public static void main(String[] args) {
        System.out.println(new nqt().get(new int[]{1,2,3,4,5,6,7,8,9,5}));
    }
}
