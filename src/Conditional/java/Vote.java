package Conditional.java;
import java.util.*;
public class Vote {
    public static void main(String[] args) {
        //Take input from the user
        //Create an instance of the Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        //Determine whether the person is eligible to vote or not
        if (age >= 18) {
            System.out.println("The person is eligible to vote");
        }
    }
}
