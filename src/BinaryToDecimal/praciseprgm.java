package BinaryToDecimal;
import java.util.*;
public class praciseprgm {
    public static int binarytodecimal(int num){
        //dec_no=dec_no+(LD * 2^pow)
        int dec_no=0;
        int pow=0;
        while(num>0){
            int LD=num%10;
         dec_no=dec_no+(LD*(int)Math.pow(2,pow));
            pow++;
         num=num/10;
        }
        return dec_no;
    }
    public static void main(String args[]){
        System.out.println("Enter the binary number to convert it into decimal number");
        Scanner sc=new Scanner(System.in);
        int Num=sc.nextInt();
      int answer= binarytodecimal(Num);
        System.out.println("Your binary number "+Num+" in decimal is "+answer);
    }

}
