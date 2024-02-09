import java.util.ArrayList;

public class Stack_using_ArrayList {
    static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();
        public boolean isEmpty(){
            return list.size()==0;
        }

        public void push(int data){
            list.add(data);
        }

        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }


    }
    public static void main(String args[]){
        Stack ele=new Stack();
        ele.push(1);
        ele.push(2);
        ele.push(3);

        while (!ele.isEmpty()){
            System.out.println(ele.peek());
            ele.pop();
        }
    }
}
