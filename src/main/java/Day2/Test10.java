package Day2;

/*
to Print Given numbe ris Arm strong or not
 */

public class Test10 {
    public static void main(String[] args) {
        int num = 153;
        int original = num;
        int result =0;
        int count = 0;

        while(num !=0){
            int last = num %10;
            count = count +1;
            result = result +(last*last*last);
            num = num/10;
        }



        System.out.println(result+"           RESULT");
        System.out.println(original+"         Original");
        System.out.println(count+"             Count");

        if(result == original) {
            System.out.println("ARMSTRONG");
        }else{
            System.out.println(" NOT ARMSTONG");
        }







    }
}
