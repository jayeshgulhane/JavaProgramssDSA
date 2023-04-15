package LoopsInJava;
import java.util.*;
public class MakeReverseToOrigina {
 public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your reverse number to print it in original state");
     int num=sc.nextInt();
     int rev=0;
     while(num>0){
         int lastdigit=num%10;
         rev=(rev*10)+lastdigit;
         num=num/10;
     }
     System.out.print("Your reverse number is:- "+rev);
 }
}
