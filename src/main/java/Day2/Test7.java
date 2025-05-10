package Day2;

public class Test7 {
    public static void main(String[] args) {
       int num = 12345;
       int reverse =0 ;
       int lastdigit;
        System.out.println(num %10);  // to get the Lastnumber
        System.out.println(num /10 );  // To remove Last number


       while(num!= 0){
           lastdigit = num % 10;
           reverse = reverse *10 + lastdigit;
           num = num /10;

        }

        System.out.println(reverse);




    }
}
