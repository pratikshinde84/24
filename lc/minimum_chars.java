package lc;

public class minimum_chars {
    public int minimumPushes(String word) {
        int res=0;
        for(char c:word.toCharArray()){
            if(c=='z'){
                res+=4;
                continue;
            }
            int rem=(c-'a'+1)%3;
            if(rem==0){
                res+=3;
            }else{
                res+=rem;
            }
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        minimum_chars m=new minimum_chars();
        m.minimumPushes("abcde");
    }
}
