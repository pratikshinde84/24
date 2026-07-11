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
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){;
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    static void print2(int n){
        for(int i=n-1;i>=0;i--){
            for(int spaces=0;spaces<i;spaces++){
                System.out.print(" ");
            }
            for(int star=0;star<n-i;star++){
                System.out.print("*");
            }
            for(int star=0;star<n-i-1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void print3(int n){
        for(int i=n;i>0;i--){
            for(int spaces=0;spaces<n-i;spaces++){
                System.out.print(" ");
            }
            for(int star=0;star<i;star++){
                System.out.print("*");
            }
            for(int star=0;star<i-1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String ar[]){
        print2(5);
        print3(5);
    }
}