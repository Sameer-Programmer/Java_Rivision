package Package_Examples;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        // Goal to print the GivenNumber is Armstrong or not  through Terinary Opertor
      /*
      Syntax :
      variable = (Expression)?result : result2;
       System.out.println(" "+output);
      */
       /* Requirement Analysis;

       given int = 153;
       153 = 1^3 +5^3 +3^3
       = 1+125+27
       extract single digit and made 3 multiplication +add to previos Number
       */
        //  System.out.println((1+125+27));
        int GivenNumber = 153;
        int OriginalNumber = GivenNumber;
        int sum = 0 ;
        int lastdigit;
        int reverse =0;
        int count =0;
        int evencount =0;
        int oddcount =0;

        for(int i = GivenNumber; i!=0; i=i/10) // decrement )
        {
            count = count+1;
            lastdigit = i%10;

            if(lastdigit%2==0){
                System.out.println(lastdigit+"  Even Number");
                evencount = evencount +1;
            }else {
                System.out.println(lastdigit+"  odd Number");
                oddcount = oddcount+1;
            }

            reverse = reverse * 10 +(lastdigit);
            sum = sum+(lastdigit*lastdigit*lastdigit);

        }
        System.out.println(evencount+"  Even Number Count");
        System.out.println(oddcount+"  Odd Number Count");


        //System.out.println((sum));
        System.out.println((sum)+"         sum");
        System.out.println((reverse)+"     reverse");
        System.out.println((count)+"     count");

        String result = (sum == OriginalNumber)?"Armstrong":"Not An Armstrong";
        System.out.println((result));



    }
}





     /* here in this i am Planning to implemnet with Terninary Operator
      if(lastdigit%2==0){
          System.out.println(lastdigit+"  Even Number");
          evencount = evencount +1;
        }else {
          System.out.println(lastdigit+"  odd Number");
          oddcount = oddcount+1;
        } */



