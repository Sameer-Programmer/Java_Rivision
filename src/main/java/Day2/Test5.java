package Day2;
/*
Swap with out third variable
 */
public class Test5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a+"              value of a");
        System.out.println(b+"                    value of b");

         a = a+b ; // 30

        // b = 10 == 30 -20
         b = a-b;

        // a = 30 ==> a = 10 --->30 -20;
        a = -(b -a) ; // 10 -30 = -20
       // System.out.println(a+"        value of a ");


        System.out.println(a+"        value of a ");
        System.out.println(b+"     value of b");




    }
}
