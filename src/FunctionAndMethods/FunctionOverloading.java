package FunctionAndMethods;

public class FunctionOverloading {
    /*Function overloading is the phenomenon in which we can make diffrent function with same name
    But,in those function we need to provide any one diffrentiative thing that will be the
     data type,number of parametrs etc */
    public static void multiply(int a,int b){
        int ans=a*b;
        System.out.println(ans);

    }
    public static void multiply(float c,double d,double e){
        double ans= c*d*e ;
        System.out.println(ans);
    }
    public static void main(String args[]){
        int a=5,b=5;
        multiply(a,b);
        float c=2;
        double d=3.8;
        double e=4.5;
        multiply(c,d,e);
    }
}
