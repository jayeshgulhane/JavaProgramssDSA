package Arrays;
import java.util.*;
public class LargestAndSmallestElementInArray {
    public static int getlargesamll(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }

        }
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i <numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smalllest element in the array is " + smallest);
        return largest;
    }
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=sc.nextInt();
        int numbers[]=new int[size];
        System.out.println("Enter the "+size+ " Element in the array ");
        for(int i=0;i<numbers.length;i++){
            numbers[i]= sc.nextInt();
        }
       int largest= getlargesamll(numbers);
        System.out.println("Largest element from the array is "+largest);

    }
}
