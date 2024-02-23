public class Word_break_problem {
    static class Node{
        create_Trie.Node children[]=new create_Trie.Node[26];
        boolean eow=false;
        Node(){
            for(int i=0; i<children.length; i++){
                children[i]=null;
            }
        }
    }
    public static create_Trie.Node root=new create_Trie.Node();

    public static void insert(String words){
        create_Trie.Node curr=root;
        for(int level=0; level<words.length(); level++){
            int idx=words.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new create_Trie.Node();
            }
            curr=curr.children[idx];
        }

        curr.eow=true;
    }

    public static boolean search(String key){
        create_Trie.Node curr=root;
        for(int level=0; level<key.length(); level++){
            int idx=key.charAt(level)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }

        return curr.eow==true;
    }

    public static boolean wordBreak(String key){
        if(key.length()==0){
            return true;
        }

        for(int i=1; i<=key.length(); i++){
            if(search(key.substring(0,i))&& wordBreak(key.substring(i))){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        String words[]={"the","a","there","their","any","thee"};
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
        String key="anytheetheir";
        System.out.println(wordBreak(key));
    }
}
