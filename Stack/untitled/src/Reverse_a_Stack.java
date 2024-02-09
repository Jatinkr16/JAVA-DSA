import java.util.Stack;

public class Reverse_a_Stack {

    public static void PushatBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top=s.pop();
        PushatBottom(s,data);
        s.push(top);
    }
    public static void ReverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        ReverseStack(s);
        PushatBottom(s,top);
    }

    public static void Printstack(Stack<Integer> s){
        while (!s.isEmpty()){
            System.out.println(s.pop());

        }
    }
    public static void main(String args[]){
        Stack<Integer> s=new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        ReverseStack(s);
        Printstack(s);
    }
}
