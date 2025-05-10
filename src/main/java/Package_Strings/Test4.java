package Package_Strings;

public class Test4 {
    public static void main(String[] args) {

        // agenda to print reverse of number
        int a =34567; // initialization // done
        int Givennumber = a;
        System.out.println(Givennumber);
        int reverse = 0;
        int lastdigit;
        // now condition and increent is pending

        // %  to get the Lastdigit
        // / to remove the Last digit
        // to store take one Container


        for(int i = a; i!=0;  i=i/10  ){
            lastdigit = i%10;
            reverse = reverse * 10 +(lastdigit);
        }
        System.out.println(reverse);

        /*while(a!=0){
           lastdigit = a%10;
           reverse = reverse *10 + lastdigit;
           a = a/10;
        }
        System.out.println(reverse);

         */












    }
}
