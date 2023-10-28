import java.util.ArrayList;

public class container_with_most_water_linear_approach {

    public static int storewater(ArrayList<Integer>list)
    {
        int maxwater=0;
        int lp=0;
        int rp=list.size()-1;

        while(lp<rp)
        {
            int height=Math.min(list.get(lp),list.get(rp));
            int width=rp-lp;
            int currwater=height*width;
            maxwater=Math.max(maxwater,currwater);

            if(list.get(lp)<list.get(rp))
            {
                lp++;
            }
            else
            {
                rp--;
            }
        }

        return maxwater;
    }
    public static void main(String args[])
    {
        ArrayList<Integer>list=new ArrayList<>();

        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        int maxwater=storewater(list);
        System.out.println(maxwater);
    }
}
