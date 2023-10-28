import java.util.ArrayList;

public class rotated_array_list_pair_sum {

    public static boolean pair_sum(ArrayList<Integer>list,int target)
    {
        int lp=0,rp=list.size()-1;
        int n=list.size();
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i)>list.get(i+1))
            {
               lp=i+1;
               rp=i;
               break;
            }
        }

        System.out.println(lp);
        System.out.println(rp);

        while(lp!=rp)
        {
            if(list.get(lp)+list.get(rp)==target)
            {
                return true;
            }
            if(list.get(lp)+list.get(rp)<target)
            {
                lp=(lp+1)%n;
            }
            if(list.get(lp)+list.get(rp)>target)
            {
                rp=(n+rp-1)%n;
            }
        }

        return false;
    }
    public static void main(String args[])
    {
        ArrayList<Integer>list=new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=16;

       boolean sum= pair_sum(list,target);
       System.out.println(sum);
    }
}
