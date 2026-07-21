package TCS;

import java.util.LinkedList;
import java.util.Queue;

public class TRREE {
    Node root;
    class Node{
        Node left,right;
        int data;
        Node(int data){
            this.data=data;
        }
    }

    void build(int ar[]){
        Queue<Node> q=new LinkedList<>();
        int i=0;
        root=new Node(ar[i++]);
        q.add(root);
        while(!q.isEmpty()){
            Node curr=q.poll();
            if(i<ar.length){
                curr.left=new Node(ar[i++]);
                q.add(curr.left);
            }
            if(i<ar.length){
                curr.right=new Node(ar[i++]);
                q.add(curr.right);
            }
        }

    }
    public static void main(String[] args) {

    }
}
