import java.util.Stack;

public class Push_at_bottom_of_stack {
    public static void PushatBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top=s.pop();
        PushatBottom(s,data);
        s.push(top);
    }
    public static void main(String args[]){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        PushatBottom(s,4);

        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
