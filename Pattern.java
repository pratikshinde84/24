class Pattern{
    static void print1(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void print(int n){
        for(int i=5;i>0;i--){
            for(int j=0;j<i;j++){;
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    public static void main(String ar[]){
        print(5);
    }
}