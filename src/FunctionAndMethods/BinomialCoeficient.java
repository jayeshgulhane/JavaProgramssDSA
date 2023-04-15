package FunctionAndMethods;
import java.util.*;
public class BinomialCoeficient {
    public static int factorial(int num){
       int fact_ans=1;
       for(int i=1;i<=num;i++){
           fact_ans=fact_ans*i;
        }
       return fact_ans;
    }
    public static int Binomial_Coeff(int fact_n,int fact_r,int fact_nmr){
        int bino_coeff_ans=fact_n/fact_r*fact_nmr;
        return bino_coeff_ans;

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of n and r and the formula is n!/r!(n-r)!");
        int n=sc.nextInt();
        int r=sc.nextInt();
       int fact_n= factorial(n);
       int fact_r=factorial(r);
       //Variable nmr is for "n-r" 'm' is stands for minus
       int fact_nmr=factorial(n-r);
       int answer=Binomial_Coeff(fact_n,fact_r,fact_nmr);
       System.out.println("Your answer for binomial coeeficient is "+answer);
    }

}
