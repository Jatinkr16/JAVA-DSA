import java.util.*;

public class shortest_path_in_direction {

    public static float shortestpath(String str)
    {
        int x=0;
        int y=0;

        for(int i=0; i<str.length(); i++)
        {
            char dir=str.charAt(i);

            if(dir=='N')
            {
                y++;
            }
            else if(dir=='S')
            {
                y--;
            }
            else if(dir=='E')
            {
                x++;
            }
            else
            {
                x--;
            }
        }

        int X2=x*x;
        int Y2=y*y;

        return (float)Math.sqrt(X2+Y2);

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your direction:");
        String str=sc.next();

        System.out.print(shortestpath(str));

    }
}
