public class Linked_List_Palindrome {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void add(int data){
        Node newNode=new Node(data);
        
        if(head==null){
            head=tail=newNode;
            size++;
            return;
        }

        tail.next=newNode;
        size++;

        tail=newNode;

    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");

    }

    public Node Midnode(Node head){
        Node slow=head;
        Node fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    public boolean Listpalindrome(){

        if(head==null || head.next==null ){
            return true;
        }
        // find mid Node
        Node midNode=Midnode(head);

        // reverse right half

        Node prev=null;
        Node curr=midNode;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }

        Node right=prev;

        // Ist half = right half
        Node left=head;
       
        while(right!=null){
          if(left.data!=right.data){
            return false;
          }
          left=left.next;
          right=right.next;
        }

        return true;
    }

    public static void main(String args[]){
        Linked_List_Palindrome ll=new Linked_List_Palindrome();

        ll.add(1);
        ll.add(2);
        ll.add(2);
        ll.add(2);
        ll.add(2);
        ll.add(1);

        ll.print();
        System.out.println(ll.Listpalindrome());
        


    }

}
