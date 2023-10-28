import java.util.ArrayList;
public class Size_of_arraylist {
    public static void main(String args[])
    {
       ArrayList<Integer>list=new ArrayList<>();

       // add operation-->o(1)

       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);
       
       System.out.println(list.size());

       for(int i=0; i<list.size(); i++)
       {
        System.out.print(list.get(i)+" ");
       }
       System.out.println();
    }
}