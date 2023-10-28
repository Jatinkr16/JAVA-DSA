public class Create_Linked_List{
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
    public static int size;

    public void addFirst(int data){  // o(1)
         // step 1--> create newnode
        Node newNode=new Node(data);
        size++;

        if(head==null){
            head=tail=newNode;
            return;
        }

        // step 2--> newnode next=head
        newNode.next=head;

        // step 3-->  head=newnode
          head=newNode;
       
    }

    public void addLast(int data){ // o(1)
        // step 1--> create newnode
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        // tail next=newNode
        tail.next=newNode;

        // tail=newNode
        tail=newNode;
    }

    public void print(){

        if(head==null){
            System.out.println("null");
        }
        Node temp=head;
        while(temp!=null){
           System.out.print(temp.data+"->");
           temp=temp.next;
        }
             System.out.println("null");
       
    }

    public void addPos(int pos, int data){
        if(pos==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<pos-1){
            temp=temp.next;
            i++;
        }

        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removefirst(){
        if(size==0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;

        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removlast(){
        if(size==0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            return val;
        }

        Node prev=head;
        int i=1;
        while(i<size-1){
            prev=prev.next;
            i++;
        }

        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;

    }

    public int itrsearch(int key){
        Node temp=head;
        int i=1;
        while(temp!=null){
            if(temp.data==key){
               return i;
            }
            temp=temp.next;
            i++;
        }

        return -1;
    }

    public int helper(Node head,int key){
          if(head==null){
             return -1;
          }
          if(head.data==key){
            return 1;
          }

          int idx=helper(head.next,key);
          if(idx==-1){
            return -1;
          }
          return idx+1;
    }

    public int recsearch(int key){
        return helper(head,key);
    }

    public void reverselist(){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public void removfromNpostoEnd(int pos){
        Node temp=head;
        int sz=0;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }

        if(pos==size){
            head=head.next;
            size--;
            return;
        }
        Node prev=head;
        int i=1;
        int mov=sz-pos;
        while(i<mov){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        size--;
        return;


    }


    public static void main(String args[])
    {
        Create_Linked_List ll=new Create_Linked_List();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();


        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();


        ll.addPos(2,9 );
        ll.print();


        // ll.removefirst();
        // ll.print();


        // ll.removlast();
        // ll.print();

        // System.out.println(ll.itrsearch(2));
        // System.out.println(ll.itrsearch(10));

        // System.out.println(ll.recsearch(2));
        // System.out.println(ll.recsearch(10));

        // ll.reverselist();
        // ll.print();

        // ll.removfromNpostoEnd(3);
        // ll.print();
        
        System.out.println("Linked list size is:"+ll.size);
    }
}