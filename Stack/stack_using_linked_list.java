public class stack_using_linked_list {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class stack{
        static Node head=null;

        public static boolean isEmpty(){
            return head==null;
        }
        public static void push(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }

            newNode.next=head;
            head=newNode;
        }

        public static int pop(){
             if(isEmpty()){
                return -1;
             }

             int value=head.data;
             head=head.next;
             return value;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int value=head.data;
            return value;
        }
    }

    public static void main(String args[]){
        stack s=new stack();

        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}
