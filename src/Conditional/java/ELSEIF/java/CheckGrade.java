package Conditional.java.ELSEIF.java;
import java.util.*;
public class CheckGrade {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks of student in 3subject");
        int sub1=sc.nextInt();
        int sub2=sc.nextInt();
        int sub3=sc.nextInt();
        //Formula chukicha ahe
        float  per=(sub1+sub2+sub3/300)*100;
        System.out.println("Your percentage is "+per);
     if(per>=95 && per<=100){
         System.out.println("You score A++ Grade");
     }
     else if(per>=85 && per<95){
         System.out.print("You scored A Grade");
     }
     else if(per>=75 && per<85){
         System.out.print("You scored B Grade");
     }
     else if(per>=65 && per<75){
         System.out.print("You scored C Grade");
     }
     else if(per>=35 && per<65){
         System.out.print("You scored D Grade");
     }
     else{
         System.out.print("Sorry!! You are Failed");
     }
    }
}
