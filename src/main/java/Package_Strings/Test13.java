package Package_Strings;

public class Test13 {
    public static void main(String[] args) {

        String s1 = "Sameer Electricals";
        System.out.println(s1);
        char last = 0;
        String reverse = "";
        System.out.println(reverse.length());

        /*
        Goal to remove white space from the string
        TO reverse the string
         */

        // to convert to Character Array ;
         char ch [] = s1.toCharArray();

         for (char x:ch){
             if(x != ' '){
                // reverse = x + reverse;
                 System.out.print(x);

             }
         }

//        for (char x:ch)
//        {
//            reverse = x + reverse;
//            /*
//            "" = s + ""---> s
//            s = a+s--->as
//            as = m+as
//
//             */
//          //  System.out.print(reverse);
//        }
        System.out.print(reverse);



    }
}
