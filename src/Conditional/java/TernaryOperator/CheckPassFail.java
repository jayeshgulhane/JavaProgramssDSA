package Conditional.java.TernaryOperator;
import java.util.*;
public class CheckPassFail {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Percentages");
        int percentage= sc.nextInt();
        String Result=percentage>35?"Pass":"Fail";
        System.out.println("You Are "+Result+" By "+percentage+"%");
    }
}
