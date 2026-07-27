import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Pratik {
    TreeNode root;
    class TreeNode{
        TreeNode left,right;
        int val;
        TreeNode(int val){
            this.val=val;
        }
    }
    void build(int ar[]){
        root=new TreeNode(ar[0]);
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int i=1;
        while(i<ar.length){
            TreeNode cur=q.poll();
            cur.left=new TreeNode(ar[i++]);
            q.add(cur.left);
            if(i<ar.length){
                cur.right=new TreeNode(ar[i++]);
                q.add(cur.right);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        int b=sc.nextInt();
        System.out.println(a);
        System.out.println(s);
        System.out.println(b);
    }
}