
public class Postfix {
    int stack[];
    int top=-1;
    Postfix(int n){
        stack=new int[n];
    }
    int pop(){
        return stack[top--];
    }
    void push(int let){
        stack[++top]=let;
    }
    int evaluate(String a){
        for(char c:a.toCharArray()){
            if(Character.isDigit(c)){
                push(c-'0');
            }else{
                int first=pop();
                int second=pop();
                if(c=='+'){
                    push(first+second);
                }else if(c=='-'){
                    push(first-second);
                }else if(c=='*'){
                    push(first*second);
                }else if(c=='/'){
                    push(first/second);
                }
            }
        }
        return stack[0];
    }
    public static void main(String[] args) {
        Postfix p=new Postfix(9);
        System.out.println(p.evaluate("12+4-4*5+"));
    }
}
