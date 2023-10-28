import java.util.*;

public class check_temprature {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double temprature=sc.nextDouble();

        if(temprature>100)
        {
            System.out.println("Fever");
        }
        else
        {
            System.out.println("Not Fever");
        }
    }
}
