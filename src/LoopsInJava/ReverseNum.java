package LoopsInJava;
import java.util.*;
public class ReverseNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your NUmber for reverse it");
        int num=sc.nextInt();
       /* while(num>0){
            int lastdigit=num%10;
            System.out.print(lastdigit);
            num=num/10;
        }*/

        for(;num>0;){
            int i;
            int lastdigit=num%10;
            System.out.print(lastdigit);
            num=num/10;

        }
    }
}
