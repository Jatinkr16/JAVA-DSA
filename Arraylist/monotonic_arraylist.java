import java.util.ArrayList;

public class monotonic_arraylist {
    public static  boolean isMonotonic(ArrayList<Integer> A) {
boolean inc = true;
boolean dec = true;
for (int i=0; i<A.size()-1; i++) {
if (A.get(i) > A.get(i+1))
inc = false;
if (A.get(i) < A.get(i+1))
dec = false;
}
return inc || dec;
}
public static void main(String args[])
{
    ArrayList<Integer>A=new ArrayList<>();

    A.add(1);
    A.add(2);
    A.add(3);
    A.add(4);

   boolean temp= isMonotonic(A);
   System.out.println(temp);
}
}
