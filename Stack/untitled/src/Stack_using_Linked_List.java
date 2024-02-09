public class Stack_using_Linked_List {
    static class StackImp{
        public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
                this.next=null;
            }
        }

        static class Stack{
           public static Node head=null;
           public static boolean isEmpty(){
               return head==null;
           }
            public static void push(int data){
                Node newNode=new Node(data);
                 if(isEmpty()){
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
                   int top=head.data;
                   head=head.next;
                   return top;
                }

                public static int peek(){
                  int top=head.data;
                  return top;
                }
            }
        }



    public static void main(String args[]){
        Stack_using_ArrayList.Stack ele=new Stack_using_ArrayList.Stack();
        ele.push(1);
        ele.push(2);
        ele.push(3);

        while (!ele.isEmpty()){
            System.out.println(ele.peek());
            ele.pop();
        }
    }
}
