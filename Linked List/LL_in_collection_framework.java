import java.util.LinkedList;

public class LL_in_collection_framework {
    public static void main(String args[]){
        LinkedList<Integer> ll=new LinkedList<>();

        // add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        ll.addFirst(3);
        ll.addLast(6);

        //print

        System.out.println(ll);

        //remove
        ll.removeLast();
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
