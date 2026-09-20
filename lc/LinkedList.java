package lc;

class LinkedList {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    void create(int[] arr){
        head = new Node(arr[0]);

        Node temp = head;

        for(int i = 1; i < arr.length; i++){
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
    }

    int search(int x){
        Node temp = head;
        int index = 0;

        while(temp != null){
            if(temp.data == x)
                return index;

            temp = temp.next;
            index++;
        }

        return -1;
    }

    void remove(int x){

        if(head == null) return;

        if(head.data == x){
            head = head.next;
            return;
        }

        Node prev = head;
        Node curr = head.next;

        while(curr != null){

            if(curr.data == x){
                prev.next = curr.next;
                return;
            }

            prev = curr;
            curr = curr.next;
        }

        System.out.println("Not Found");
    }

    void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}