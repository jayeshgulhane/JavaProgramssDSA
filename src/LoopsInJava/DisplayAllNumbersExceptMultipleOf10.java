package LoopsInJava;
import java.util.*;
public class DisplayAllNumbersExceptMultipleOf10 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number Except multiple of 10 because that eill not print");

        while(true){
            int num=sc.nextInt();
            if(num%10==0){
                System.out.println(num+" Will not get print in series because this is the multiple of 10");
                continue;
            }
            System.out.println(num);
        }
    }
}
