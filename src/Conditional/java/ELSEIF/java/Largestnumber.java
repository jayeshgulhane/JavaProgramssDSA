package Conditional.java.ELSEIF.java;
import java.util.*;
public class Largestnumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any three number");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("Num1 " +num1+" Is greater in all");
        }
        else if(num2>num3){
            System.out.println("Num2 " +num2+ "Is greater in all");
        }
        else{
            System.out.println("Num3 " +num3+ "Is greater in all");
        }

    }
}
