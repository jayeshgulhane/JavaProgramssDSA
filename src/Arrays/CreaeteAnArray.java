package Arrays;
import java.util.*;
public class CreaeteAnArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Create An Array "Datatype ArrayName[]=new DataType[SizeOfArray];"
        int marks[]=new int[100];
        System.out.println("Enter the marks of the Phy,Chem and Maths");
        marks[0]= sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]= sc.nextInt();

        System.out.println("Physics marks :"+marks[0]);
        System.out.println("Chemistry marks :"+marks[1]);
        System.out.println("Maths marks :"+marks[2]);
        int percentage=(marks[0]+marks[1]+marks[2])/3;
        //300 chya don zero ani 100 che don zero CANCEL OUT
        System.out.println("Percentage score by the student is :"+percentage+ "%");
        System.out.println("Length of the Array is "+marks.length);
    }

}
