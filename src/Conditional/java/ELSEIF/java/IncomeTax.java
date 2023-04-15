package Conditional.java.ELSEIF.java;
import java.util.*;
public class IncomeTax {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter t=your respective Income");
        int income=sc.nextInt();
        int tax;
        if(income>500000){
            tax=(int) (income*0.2);
        }
        else if(income>500000 && income<=1000000){
            tax=(int) (income*0.3);//Type cast kela ahe int madhe
        }
        else{
            tax=(int) (income*0.5);//Type cast kela ahe int madhe
        }
        System.out.println("Your tax on your "+income+" Is "+tax);
    }
}
