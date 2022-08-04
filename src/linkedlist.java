class linkedlist{
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

        //assigning value
        l.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);

        //joining list
        l.head.next=second;
        second.next=third;

        //printing value
        while(l.head!=null){
            System.out.println(l.head.value+" ");
            l.head=l.head.next;
        }
    }
}











