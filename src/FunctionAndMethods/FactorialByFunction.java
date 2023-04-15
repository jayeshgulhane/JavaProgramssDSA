package FunctionAndMethods;
import java.util.*;
public class FactorialByFunction {
    public static int factorail(int num){
        int facto=1;
         for(int i=1;i<=num;i++){

             facto= facto * i;
         }
         return facto;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for finding the Factoria; :");
        int num=sc.nextInt();
      int fact_ans=  factorail(num);//Function call
        System.out.println("Factoral of "+num+" Is a :"+fact_ans);
    }

}
