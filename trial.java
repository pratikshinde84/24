class trial{
    public boolean canPlaceFlowers(int[] f, int n) {
        if(n==0)return true;
        int count=0,zero=0;
        if(f[0]==0&&f[1]==0){
            count++;
        }
        for(int i=1;i<f.length-1;i++){
            if(f[i]==0)zero++;
            if(zero==3){
                count++;
                zero=1;
            }
        }
        if(f[f.length-1]==0&&zero>0){
            count++;
        }
        return count>=n;
    }
    public static void main(String[] args) {
        System.out.println(new trial().canPlaceFlowers(new int[]{1,0,1,0,1,0,1}, 1));
    }
}