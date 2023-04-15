package PractiseQuestion;
//Write a Java method to compute the averageof three numbers..
public class AverageOfNumbers {
    public static void avg(float num1,float num2,float num3){
        float avg;
        avg=(num1+num2+num3)/3;
        System.out.println("Your 3 number average is "+avg);

    }
    public static void main(String args[]){
        avg(1,1,1);
    }

}
