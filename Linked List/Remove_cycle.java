public class Remove_cycle {
   
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
    
        public static boolean iscycle(){
            Node slow=head;
            Node fast=head;
            
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;

                if(slow==fast){
                    return true;
                }

              
            }
            return false;
        }

        public void print(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        public static void removcycle(){
            // detect cycle

            Node slow=head;
            Node fast=head;
            boolean cycle=false;

            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                     cycle=true;
                }
            }

            cycle=false;

            if(cycle==false){
                return;
            }
            
            // meet point
            slow=head;
            Node prev=null;
            while(slow!=fast){
                prev=fast;
                slow=slow.next;
                fast=fast.next;
            }

            prev.next=null;
        }
        public  static void main(String args[]){

            Remove_cycle ll=new Remove_cycle();  
            head=new Node(1);
            Node temp=new Node(2);
            head.next=temp;
            head.next.next=new Node(3);
            head.next.next.next=temp;
            System.out.println(iscycle());
            ll.removcycle();
            ll.print();

        }
}


