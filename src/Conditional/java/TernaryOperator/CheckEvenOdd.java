package Conditional.java.TernaryOperator;
import java.util.*;
public class CheckEvenOdd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number for checking odd or even");
        int num=sc.nextInt();
        //Tenary operator use behalf of the if else..
        String type=(num%2==0)?"Even":"Odd";
        System.out.println(type);
    }
}
