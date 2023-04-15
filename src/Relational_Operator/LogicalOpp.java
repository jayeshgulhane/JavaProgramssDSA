package Relational_Operator;

public class LogicalOpp {
    public static void main(String[] args){
        System.out.println((5>2)&&(3>1));//Both statement are true so in and true true is TRUE
        System.out.println((5<2)&&(3>1));//One stat. is false and one stat. is true still Final ans False
        //In and any stat is false then final ans is FALSE
        System.out.println((5<2)&&(3<1));//Both stat. are false so end final ans. is FALSE
        //OR
        System.out.println((10>12)||(12>2));//In or ant one condtion is true at that time final answer is true
        //Only when both conditon is false at that time final answer is false otherwise it always be TRUE
        System.out.println(!(100>10));//he true ahe pnn not(!) mule he not madhe convert zala ani true cha false zala
    }
}
