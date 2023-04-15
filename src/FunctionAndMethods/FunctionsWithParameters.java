package FunctionAndMethods;
import java.util.*;
public class FunctionsWithParameters {
    public static int calculate(int num1,int num2) {
/* Here num1 and num2 are the "Parameters" or "Formal Parameters"*/
        int  sum=num1+num2;
        //System.out.println("Sum is :"+sum);
        return sum;//This sum variable and sum variable on 16th line both are diffrent
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
    int sum=   calculate(a,b);//This sum variable and sum variable on 8th line both are diffren
       /* Here a and b are the arguements which we passed to the function
       also it is called as actual parameters
        */
        System.out.println("Sum is :"+sum);
    }
}
