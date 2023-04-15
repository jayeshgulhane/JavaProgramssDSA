package LoopsInJava;
import java.util.*;
public class BreakKeywordQuestion {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number and check wheather it is multiple of 10 or not");
        int num;
        while(true){
            num=sc.nextInt();
            if(num%10==0){
                break;
            }
            System.out.println(num+" Not a multiple of 10");
        }
       // int num;
        System.out.println("Number "+num+" Is multiple of 10 so we exit form the loop");
    }
}
