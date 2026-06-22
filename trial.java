class trial{
    public boolean canPlaceFlowers(int[] f, int n) {
        int count=0;
        for(int i=0;i<f.length;i++){
            if(f[i]==0){
                boolean left=i==0||f[i-1]==0;
                boolean right=i==f.length-1||f[i+1]==0;
                if(left&&right){
                    f[i]=1;
                    count++;
                }
            }
        }
        return count>=n; 
    }
    public static void main(String[] args) {
        System.out.println(new trial().canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
    } 
}