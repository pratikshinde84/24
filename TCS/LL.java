package TCS;

import java.util.Scanner;

public class LL {
    class Node{
        Node next;
        int val;
        Node(int val){
            this.val=val;
        }
    }
    Node build(int ar[]){
        Node head=null,temp=null;
        for(int i=0;i<ar.length;i++){
            if(head==null){
                head=new Node(ar[i]);
                temp=head;
            }else{

                temp.next=new Node(ar[i]);
                temp=temp.next;
            }
        }
        return head;
    }
    int sum(Node head){
        int ans=0;
        Node temp=head;
        while(temp!=null){
            ans+=temp.val;
            temp=temp.next;
        }
        return ans;
    }
    void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val+"->");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        Node head=new LL().build(ar);
        new LL().display(head);
        System.out.println(new LL().sum(head));
    }
}
