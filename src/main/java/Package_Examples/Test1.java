package Package_Examples;

public class Test1 {
    public static void main(String[] args) {
        // to print the reverse of number;
        int a = 6789345;
        int count =0;
        int reverse = 0;
        int lastdigit;
       // System.out.println(a%10); // to get the lastnumber
      //  System.out.println(a/10); // to remove the Last number

        while(a!=0){
            count =count +1;
            lastdigit = a%10;
            reverse = reverse *10 +(lastdigit) ;
            a = a/10;
        }
        System.out.println(reverse);
        System.out.println(count);
    }
}
