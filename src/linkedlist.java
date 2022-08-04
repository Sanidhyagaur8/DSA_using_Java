
//Basic Linked List
class linkedlist{

    //Creating Node
    Node head;
    static class Node{
        int value;
        Node next;
        Node(int d){
            value=d;
            next=null;

        }
    }

    public static void main(String[] args) {
        linkedlist l=new linkedlist();

        //assigning values
        l.head=new Node(10);
        Node second=new Node(20);
        Node three =new Node(30);
        Node four=new Node(40);

        //joining nodes
        l.head.next=second;
        second.next=three;
        three.next=four;
        four.next=null;

        //printing Linked List
        while(l.head!=null){
            System.out.print(l.head.value+" ");
            l.head=l.head.next;
        }

    }
}


//Operations on Linked List
