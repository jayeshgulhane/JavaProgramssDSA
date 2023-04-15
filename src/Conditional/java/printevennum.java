package Conditional.java;
import java.util.*;
public class printevennum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int number=sc.nextInt();

        if(number%2==0){
            System.out.println("Your number is EVEN");
        }
        else{
            System.out.println("Your number is ODD");
        }
    }
}
