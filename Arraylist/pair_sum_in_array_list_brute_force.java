import java.util.ArrayList;

public class pair_sum_in_array_list_brute_force {
    public static boolean pair_sum(ArrayList<Integer>list, int target)
    {
        for(int i=0; i<list.size(); i++)
        {
            for(int j=i+1; j<list.size(); j++)
            {
                if(list.get(i)+list.get(j)==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target=5;

        boolean sum=pair_sum(list,target);
        System.out.println(sum);
    }
}
