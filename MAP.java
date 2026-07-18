import java.util.HashMap;
import java.util.Map;

public class MAP {
    void freq(int ar[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:ar){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.values()){
            System.out.println(i);
        }
        for(int i:map.keySet()){
            System.out.println(i);
        }
        for(Map.Entry entry:map.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
    public static void main(String[] args) {
        new MAP().freq(new int[]{1,1,1,2,3,4,5,6,7,2,3,4,5,6,3,2,1,2,3,5,6,7});
    }
}
