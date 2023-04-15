package Arrays;

public class PassingArrayAsArguements {
    public static void update(int marks[],int nonchangable){

        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
            //Ithe marks update kele aani change main function madhe pn zala
        }
    }
    public static void main(String args[]){
        int marks[]={97,98,99};

        for(int i=0;i<marks.length;i++){
            System.out.println("Marks Before updates " +marks[i]);
        }
        System.out.println("");
        int nonchangable=5;
        update(marks,nonchangable);//call to that update function

        for(int i=0;i<marks.length;i++){
            System.out.println("Marks After updates " +marks[i]);
        }
    }

}
