
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
class linkedlist1{
    node head;
    static class node{
        int value;
        node next;
        node(int d){
            value=d;
            next=null;
        }
    }

    //insert new node at beginning
    public void insertatbeginning(int data){
        node n= new node(data);
        n.next=head;
        head=n;
    }

    //insert new node in middle
    public void insertatmiddle(node prev_node, int data){
        if(prev_node==null){
            System.out.println("No previous node ");
            return;
        }
        node new_node= new node(data);
        new_node.next=prev_node;
        prev_node.next=new_node;
    }

    //print
   public void display(){
       node tnode=head;
        while(tnode != null){
           System.out.print(tnode.value+" ");
           tnode=tnode.next;
       }
   }

    public static void main(String[] args) {
       linkedlist1 l=new linkedlist1();
       l.insertatbeginning(10);
       l.insertatbeginning(22);
       l.insertatmiddle(l.head.next,20);
       l.display();

    }
}