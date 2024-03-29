import java.util.*;
public class Implementation_of_HashMap {
    static class HashMap<k,v>{


        private class Node {
            k key;
            v value;

            public Node(k key, v value) {
                this.key = key;
                this.value = value;
            }
        }
            private int n; // n
            private int N;
            private LinkedList<Node> buckets[]; //N

            public void HashMap() {
                this.n = 4;
                this.buckets = new LinkedList[4];
                for (int i = 0; i < 4; i++) {
                    this.buckets[i] = new LinkedList<>();
                }
            }

            private int hashmap(k key){
                int hc=key.hashCode();
                return Math.abs(hc)%N;
            }
            private int searchinLL(k key,int bi){
                LinkedList<Node> ll=buckets[bi];
                int di=0;

                for(int i=0; i<buckets.length; i++){
                    Node node=ll.get(i);
                    if(node.key==key){
                        return di;
                    }
                }
                return -1;
            }

            public void rehash(){
                LinkedList<Node> oldBuckets[]=buckets;
                buckets=new LinkedList[2*N];
                N=2*N;
                for(int i=0; i<buckets.length; i++){
                    buckets[i]=new LinkedList<>();
                }

                for(int i=0; i<oldBuckets.length; i++){
                    LinkedList<Node>ll=oldBuckets[i];
                    for(int j=0; j<ll.size(); j++){
                        Node node=ll.remove();
                        put(node.key,node.value);
                    }
                }
            }

            public void put(k key,v value){
                int bi=hashmap(key);
                int di=searchinLL(key,bi);

                if(di!=-1){
                    Node node=buckets[bi].get(di);
                    node.value=value;
                } else{
                    buckets[bi].add(new Node(key, value));
                    n++;
                }

                double lambda=(double) n/N;
                if(lambda>2.0){
                    rehash();
                }
            }

            public boolean containsKey(k key){
                int bi=hashmap(key);
                int di=searchinLL(key,bi);

                if(di!=-1){
                   return true;
                } else{
                   return false;
                }
            }

            public v get(k key){
                int bi=hashmap(key);
                int di=searchinLL(key,bi);

                if(di!=-1){
                    Node node=buckets[bi].get(di);
                    return node.value;
                } else{
                    return null;
                }
            }

            public v remove(k key){
                int bi=hashmap(key);
                int di=searchinLL(key,bi);

                if(di!=-1){
                    Node node=buckets[bi].remove(di);
                    return node.value;
                } else{
                    return null;
                }
            }

            public ArrayList<k> getkey(k key){
                ArrayList<k> keys=new ArrayList<>();
                for(int i=0; i<buckets.length; i++){
                    LinkedList<Node> ll=buckets[i];
                    for(Node node: ll){
                        keys.add(node.key);
                    }
                }
                return keys;
            }
            public boolean isEmpty(){
                return n==0;
            }
        }

    public static void main(String args[]){
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("China",50);
        hm.put("Us",24);


    }
}
