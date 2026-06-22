class a{
    int majorityElement(int arr[]) {
        int count=0,num=arr[0];
        for(int i=1;i<arr.length;i++){
            if(num==arr[i]){
                count++;
                continue;
            }else{
                count--;
            }
            if(count==0){
                num=arr[i];
            }
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println(new a().majorityElement(new int[]{1,1,2,1,3,5,1}));
    }
}