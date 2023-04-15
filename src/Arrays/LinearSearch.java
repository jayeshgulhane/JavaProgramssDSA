package Arrays;
import java.util.*;
public class LinearSearch {
    public static int linearsearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
       return -1;//assa kahi nahi ki -1 ch ghya lagte kahi pn gheu shakto bass condition match karaysathi
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of an array you want");
        int size= sc.nextInt();
        int numbers[]=new int[size];
        System.out.println("Enter the "+size+ " Element in the Array");
        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println("Your Array is :");
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        System.out.println();
        System.out.println("Enter the element for searching it From Array :");
        int key=sc.nextInt();
      int index=  linearsearch(numbers,key);
      if(index==-1){
          System.out.println("Element not found");
      }
      else{
          System.out.println("Elements found at index :"+index);
      }
    }
}
