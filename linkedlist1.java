class Node
{
    int data;
    Node next;
    Node(int data){
  this.data = data;
  this.next = null;

    }

    void printll(Node head)
    {
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}


class linkedlist1{

    public static void main(String[] args) {
       Node head = new Node(10);
       Node l1 = new Node(20);
       Node l2 = new Node(30);

       head.next = l1;
       l1.next=l2;
       l2.next = null;
       
       head.printll(head);

    }
}