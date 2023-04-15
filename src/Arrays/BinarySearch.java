package Arrays;
import java.util.*;
import java.util.Arrays;
public class BinarySearch{
    public static void binarysearch(int SortArray[],int key){


    }

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size for an array");
    int size=sc.nextInt();
    int Array[]=new int[size];
    System.out.println("Enter the "+size+" Elements in the array");
    for(int i=0;i<size;i++){
        Array[i]=sc.nextInt();
    }

    /*for (int i = 0; i <Array.length; i++){
        for(int j=0;j<Array.length;j++){
            if(Array[i]<Array[j]){
                int temp=Array[i];
                Array[i]=Array[j];
                Array[j]=temp;
            }
        }
    }
    for(int i=0;i<Array.length;i++){
        System.out.println(+Array[i]);
    }*/
    Arrays.sort(Array);
    System.out.println("Modified arr[] : "
            + Arrays.toString(Array));
    int start=0;
    int end=size-1;
    System.out.println("Enter the element you  to search ");

}
        }