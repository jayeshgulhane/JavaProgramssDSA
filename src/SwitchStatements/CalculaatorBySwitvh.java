package SwitchStatements;
import java.util.*;
public class CalculaatorBySwitvh {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two number for performing operation on it");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Enrer opertor you wish from + - * % and / only");
        char operator=sc.next().charAt(0);
        switch (operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
               System.out.println(num1-num2);
                break;
            case '*':
                System.out.println("Multiplication is "+num1*num2);
                break;
            case '/':
                System.out.println("Divison is "+num1/num2);
                break;
            case '%':
                System.out.println("Mod is "+num1%num2);
                break;
            default:
                System.out.println("Enter proper operator among + - * / % only");
        }

    }
}
