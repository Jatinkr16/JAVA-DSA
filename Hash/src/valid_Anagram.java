import java.util.HashMap;

public class valid_Anagram {
    public static boolean checkAnagram(String s, String t){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            } else{
                map.put(ch,1);
            }
        }
        System.out.println(map);

        for(int i=0; i<t.length(); i++){
            char ch=t.charAt(i);
            if(map.get(ch)!=null){
                if(map.get(ch)==1){
                    map.remove(ch);
                } else{
                    map.put(ch,map.get(ch)-1);
                }

            }
            else{
                return false;
            }
        }

        if(map.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String args[]){
        String s="race";
        String t="care";

        System.out.println(checkAnagram(s,t));
    }
}
