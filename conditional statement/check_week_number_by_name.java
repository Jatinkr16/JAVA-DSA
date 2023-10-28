import java.util.*;

public class check_week_number_by_name {
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a week nuber:");
    int number=sc.nextInt();

    switch(number)
    {
        case 1: System.out.println("Monday");
                break;

        case 2: System.out.println("Tuesday");
                break;

        case 3: System.out.println("Wednesday");
                break;

        case 4: System.out.println("thursday");
                break;

        case 5: System.out.println("Friday");
                break;

        case 6: System.out.println("Saturday");
                break;

        case 7: System.out.println("Sunday");
                break;

        default: System.out.println("That's not a week number");
    }
   }
}
