package Day2;

public class Test11 {
    public static void main(String[] args) {
        int num = 121;
        int original = num;
        int result =0 ;
        int lastdigit;
        System.out.println(num %10);  // to get the Lastnumber
        System.out.println(num /10 );  // To remove Last number


        while(num!= 0){
            lastdigit = num % 10;
            result = result + lastdigit;
            System.out.print(result+"         ");
            num = num /10;
        }
        System.out.println(result);







    }
}
