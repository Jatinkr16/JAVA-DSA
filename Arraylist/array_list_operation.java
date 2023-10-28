import java.util.ArrayList;
public class array_list_operation {
    public static void main(String args[])
    {
       ArrayList<Integer>list=new ArrayList<>();

       // add operation-->o(1)

       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);

       System.out.println(list);

       // add operation-->o(n)

       list.add(1,10);
       System.out.println(list);

       // get element-->o(1)

       int element=list.get(3);
       System.out.println(element);
       
       // remove element--> o(n)

       list.remove(4);
       System.out.println(list);

       // set element--> o(n)

       list.set(3,15);
       System.out.println(list);

       // contains element--> o(n)

       System.out.println(list.contains(2));
       System.out.println(list.contains(20));
    }
}
