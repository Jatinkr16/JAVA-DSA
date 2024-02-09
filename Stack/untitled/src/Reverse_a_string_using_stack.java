import java.util.Stack;

public class Reverse_a_string_using_stack {
    public static String Reversestring(String str){
       Stack<Character> s=new Stack<>();
       int idx=0;

       while(idx<str.length()){
           s.push(str.charAt(idx));
           idx++;
       }

       StringBuilder result=new StringBuilder("");
       while(!s.isEmpty()){
           char curr=s.pop();
           result.append(curr);
       }

       str=result.toString();
       return str;

    }
    public static void main(String args[]){
        String str="Helloworld";
        String result=Reversestring(str);
        System.out.println(result);
    }
}
