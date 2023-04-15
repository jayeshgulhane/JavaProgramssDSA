package FunctionAndMethods;
import java.util.*;
public class ProuctByFunction {
    public static int multiply(int num1,int num2){
        int ans=num1*num2;
        return ans;

    }
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two values for multiplication");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int ans=multiply(num1,num2);
        //able to take any variable on the place of ans
        System.out.println("Your Multiplication is "+ans);
}

}
