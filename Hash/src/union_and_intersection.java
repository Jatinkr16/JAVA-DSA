import java.util.HashSet;

public class union_and_intersection {
    public static void main(String args[]){
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,1,2,4};

        HashSet<Integer> set=new HashSet<>();

        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }

        System.out.println("union= "+set);

        // intersection
        set.clear();
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        System.out.print("intersection= ");
        for(int i=0; i<arr2.length; i++){
            if(set.contains(arr2[i])){
                System.out.print(arr2[i]+" ");
                set.remove(arr2[i]);
            }
        }
    }
}
