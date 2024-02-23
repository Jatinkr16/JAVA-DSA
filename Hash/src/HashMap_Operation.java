import java.util.HashMap;

public class HashMap_Operation {
    public static void main(String args[]){
        HashMap<String,Integer> hm=new HashMap<>();

        //insert->0(1)
        hm.put("India",100);
        hm.put("China",150);
        hm.put("Us",50);

        System.out.println(hm);

        // get->0(1)
       int value= hm.get("India");
       System.out.println(value);

        //containsKey ->0(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        // remove->0(1)
       System.out.println( hm.remove("India"));
        System.out.println(hm);
       System.out.println(hm.remove(hm.remove("Indonesia")));
        System.out.println(hm);

        // size
        System.out.println(hm.size());

        //clear
        hm.clear();

        // isEmpty
        System.out.println(hm.isEmpty());

    }
}
