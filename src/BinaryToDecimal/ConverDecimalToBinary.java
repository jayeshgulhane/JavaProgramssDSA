package BinaryToDecimal;
import  java.util.*;
public class ConverDecimalToBinary {
    public static void DecToBin(int num) {
        //binaryno=binaryno+(remainder*10^pow)
        int binno = 0;
        int pow = 0;
        int mynum=num;// mynum madhe parat khalchi value store keli ahe je user ne pathwali beuase te line 15 vr print keli ahe.
        while (num > 0) {
            int rem = num % 2;//By module able to get remainder
            binno = binno + (rem * (int) Math.pow(10, pow));
            pow++;
            num = num / 2;
        }
        System.out.println("My Decimal number " +mynum+ " Is "+binno);
    }
        public static void main (String args[]){

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Decial number for Converting it into the Binary Number");
            int Num= sc.nextInt();
           DecToBin(Num);

        }
    }

