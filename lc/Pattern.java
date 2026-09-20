package lc;

public class Pattern {
    void pattern(int n){
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern pt=new Pattern();
        pt.pattern(5);
    }
}
