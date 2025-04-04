package Package_1;

public class Test7_TerinaryOperater {
    public static void main(String[] args) {
        /* == relational Operator
        = Assignment Operator
        ? --> Terinary Operator
         */
// Syntax of Terinary Operator
       // variable = Expression ? result1:result2 ;
                int x = 10;
                int result = (x>1)? 1:0;
        System.out.println(result);

        double age = 13;
        String  vote = (age>18)? "Eligible":"Not Eligible";
        System.out.println(vote);



    }
}
