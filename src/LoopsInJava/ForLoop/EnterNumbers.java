package LoopsInJava.ForLoop;
import java.util.*;
//Print N NUMBERS TAKING VALUE IF N FROM THE USER
public class EnterNumbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number you want to print");
        int num=sc.nextInt();
        int i=1;
        for(i=1;i<=num;i++){
            System.out.println(i);
        }
    }

}
