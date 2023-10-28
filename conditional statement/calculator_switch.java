import java.util.*;

public class calculator_switch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of a:");
        int a = sc.nextInt();
        System.out.print("enter value of b:");
        int b = sc.nextInt();
        System.out.print(" enter the operator:");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("the result is:" + (a + b));
                break;

            case '-':
                System.out.println("the result is:" + (a - b));
                break;

            case '*':
                System.out.println("the result is:" + (a * b));
                break;

            case '/':
                System.out.println("the result is:" + (a / b));
                break;

            case '%':
                System.out.println("the result is:" + (a % b));
                break;

            default:
                System.out.println("wrong operator");
        }

    }
}
