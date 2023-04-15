package SwitchStatements;
import java.util.*;
public class OrderSomething {
 public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter 1 For Smosa\nEnter 2 For Cold Drink\nEnter 3 For Breakfast");
     int number= sc.nextInt();
     switch (number){
         case 1:
             System.out.println("Your Order Of Samosa Register");
             break;
         case 2:
             System.out.println("Your Order Of Cold Drink Is Register");
             break;
         case 3:
             System.out.println("Your Order Of BreakFast is Register");
             break;
         default:
             System.out.println("You Enters invalid number plz enter valid number form above 1 2 3 only for your order");
     }

 }
}
