package FunctionAndMethods;
import java.util.*;
public class NumberPrimeOrNot {
   /* public static void isItPrime(int num){
       for(int i=2;i<=num-1;i++){
           if(num%i==0){
               System.out.println("Your number is not a prime number it is a composite number");

           }
           else{
               System.out.println("Your number is a prime number");
           }
           return;//It is important to write because it returns to main function to terminate the program
           // If I dont write the return keyword then a my loop is not terminated and o/p appears the N number of time


       }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number to check whether it is Prime or not");
        int num=sc.nextInt();
        isItPrime(num);
    }
}*/
// CODE BY BOOLEAN DATATYPE
public static boolean primeornot(int num){
   boolean isprime=true;
   if(num==2){
       return isprime;
   }
   for(int i=2;i<=num-1;i++){
       if(num%i==0){
          return isprime=false;
       }
   }
   return isprime;
 }
 public static void PrimeinRange(int range){
    for(int i=2;i<=range;i++){
      boolean prime= primeornot(i);//Calling to primeornot function for checking value true or false on line no.27
        if(prime==true){
            System.out.print(i+" ");
        }
    }

 }
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number to check its Prime or Not");
    int num=sc.nextInt();
    boolean ans=primeornot(num);
    System.out.println("Your number " +num+ " is Prime. True or False :- "+ans);
    System.out.println("\n FOR PRINTING N NUMBERS OF PRIME NUMBERS ");
    System.out.println("Enter the range until you want to print prime numbers");
    int range= sc.nextInt();
    PrimeinRange(range);
 }

}