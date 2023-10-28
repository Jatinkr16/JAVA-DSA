/* An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make the production of both types of vehicle according to the given data below:

1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
2nd data, Total number of wheels = W */

import java.util.*;
public class test
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v= sc.nextInt();
		int w= sc.nextInt();
		int x;
		if(w <=2 || w%2!=0 || v>w){
		    System.out.println("INVALID INPUT");
		}
		else
		{
		     x = (w-2*v)/2;
		     System.out.println("TW =" + x +" FW = "+ (v-x) );
		}
		
	}
}

