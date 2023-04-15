package LoopsInJava;

public class BreakKeyword {
    public static void main(String args[]){

        for(int i=1;i<=5;i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }
        //i chi value 3 chya equal zali if block madhe gela tithe break disla aani to exit zala loop chya direct.
        System.out.println("I am out the loop beacuse use break keyword which is used to exit form the any loop");
    }
}
