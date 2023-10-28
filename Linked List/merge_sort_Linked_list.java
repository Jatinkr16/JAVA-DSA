public class merge_sort_Linked_list {
    public static class Node{
        int data;
        Node next;

      public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int  size;

    public void add(int data){
        Node newnode=new Node(data);

        if(head==null){
            head=tail=newnode;
            size++;
            return;
        }

        tail.next=newnode;
        tail=newnode;
        return;
    }


    private Node midnode(Node head){
        Node slow=head;
        Node fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    private Node merge(Node head1,Node head2){
       Node mergell=new Node(-1);
       Node temp=mergell;

        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                temp=temp.next;
                head1=head1.next;
            }
            else{
                temp.next=head2;
                temp=temp.next;
                head2=head2.next;
            }
        }

        while(head1!=null){
             temp.next=head1;
             temp=temp.next;
             head1=head1.next;
        }
        while(head2!=null){
            temp.next=head2;
            temp=temp.next;
            head2=head2.next;
        }

        return mergell.next;
    }
    public Node mergesort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node mid=midnode(head);

        Node rightNode=mid.next;
        mid.next=null;

       Node newleft= mergesort(head);
       Node newright= mergesort(rightNode);
     
      return merge(newleft, newright);
    }

    public void print(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");

    }
    public static void main(String args[])
    {
        merge_sort_Linked_list ll=new merge_sort_Linked_list();
        ll.add(5);
        ll.add(3);
        ll.add(7);
        ll.add(1);
        ll.add(9);
        ll.add(4);

        ll.print();
       ll.head=ll.mergesort(head);
       ll.print();
    }
}
