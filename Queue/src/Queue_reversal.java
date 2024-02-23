import java.util.*;

public class Queue_reversal {
    public static void QueueReversal(Queue<Integer> q){
        Stack<Integer> s=new Stack<>();
        if(q.isEmpty()){
            s.push(-1);
        } else {
            while (!q.isEmpty()) {
                s.push(q.remove());
            }
        }

        while(!s.isEmpty()){
          q.add(s.pop());
        }


    }
    public static void main(String args[]){
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        QueueReversal(q);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
