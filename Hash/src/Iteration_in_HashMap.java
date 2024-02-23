import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Iteration_in_HashMap {
    public static void main(String args[]){
        HashMap<String,Integer> hm=new HashMap<>();


        hm.put("India",100);
        hm.put("China",150);
        hm.put("Us",50);
        hm.put("Indonesia",6);
        hm.put("Bhutan",5);

        Set<String> keys=hm.keySet();
        System.out.println(keys);
        System.out.println(hm);

        for(String k:keys){
            System.out.println("key="+k+",value="+hm.get(k));
        }

    }
}
