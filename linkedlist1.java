class ll{
{
    Node head;
    
    class Node{
        int data;
        Node next;
        
        node(int data)
        {
            this.data = data;
            this.next = null;
        }

    }


public void addfirst(int data)
{
    node newnode = new Node(data);
    newnode.next = head;
    head = newnode;

}
 
public void printlist()
{
    Node currnode = head;
    if(head==null)
    {
        return;
    }
    else{
        while(currnode!=null)
        {
            System.out.println(currnode.data);
            currnode = currnode.next;
        }
        
    }

}

public static void main(String[] args)
{
ll list = new list();
list.addfirst(8);
list.addfirst(98);
list.printlist();
}
}