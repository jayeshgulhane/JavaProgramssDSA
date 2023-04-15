package LoopsInJava;
//Continue keyword is used for skip particular skip in the loop
public class ContinueKeyword {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            //I want to skip 3 and print only 1 2 4 5 not 3 so for that I will used CONTINUE Keyword
            if(i==3){
                continue;
                //I Skip 3
            }
            System.out.println(i);
        }
    }
}
