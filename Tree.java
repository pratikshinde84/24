import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Tree{
    Node root;
    int h=-1;
    class Node{
        int val;
        Node left,right;
        Node(int val){
            this.val=val;
        }
    }
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ar[] = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        Tree tree = new Tree();   // One object

        tree.buildTree(ar);

        System.out.println(tree.getHeight(tree.root));

        preorder(tree.root);
    }
    private static void preorder(Node root) {
        if(root==null)return;
        preorder(root.left);
        System.out.println(root.val);
        preorder(root.right);
    }
    int getHeight(Node root) {
        if(root==null){
            return 0;
        }
        int left=1+getHeight(root.left);
        int right=1+getHeight(root.right);
        return Math.max(left,right);
    }
    void buildTree(int[] ar) {
        Queue<Node> q=new LinkedList<>();
        if(ar.length>0){
            root=new Node(ar[0]);
            q.offer(root);
        }  
        int i=1;
        while(!q.isEmpty()&&i<ar.length){
            Node temp=q.poll();
            temp.left=new Node(ar[i++]);
            q.offer(temp.left);
            if(i<ar.length){
                temp.right=new Node(ar[i++]);
                q.offer(temp.right);
            }
        }
    }
}