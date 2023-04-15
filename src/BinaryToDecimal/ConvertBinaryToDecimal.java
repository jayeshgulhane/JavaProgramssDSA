package BinaryToDecimal;
import java.util.*;

public class ConvertBinaryToDecimal {
    //dec_no=dec_no+(LD*2^power)
    public static int BinaryToDeciamal(double binary_no) {
        int pow = 0;
        int dec_no = 0;
        while (binary_no > 0) {
            int LD = (int) binary_no % 10;
            dec_no = dec_no + (LD * (int) Math.pow(2, pow));
            pow++;
            binary_no = (int) binary_no / 10;
            }
        return dec_no;
    }
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Print your binary number in the 0's and 1's");
        double binary_no = sc.nextDouble();
        int answer= BinaryToDeciamal(binary_no);
        System.out.println(answer);
    }
}
