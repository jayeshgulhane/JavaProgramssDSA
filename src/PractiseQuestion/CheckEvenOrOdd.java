package PractiseQuestion;

import java.util.Scanner;

public class CheckEvenOrOdd {

    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the nuber for cheking the even or odd");
            int num=sc.nextInt();

           // if (isEven(num)) This Is not working
        if(num%2==0){
            System.out.println("Your number "+num+"Is Even");
     }
        else{
            System.out.println("Your number "+num+" Is Odd");
        }

    }


}
