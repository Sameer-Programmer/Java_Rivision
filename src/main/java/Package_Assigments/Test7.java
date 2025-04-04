package Package_Assigments;

public class Test7 {
    public static void main(String[] args) {
        // agenda to print
/*		count of number
		sum of number
		count event numbers
		count Odd Numbers
		print even number
		print Odd numbers */


        int Given_Number = 1234567890;
        int count = 0, sum = 0, EvenCount =0, OddCount = 0;
        String evennumbers = "";
        String Oddnumbers = "";
        int Last_digit;

        while (Given_Number!=0){
            count = count+1;
            Last_digit = Given_Number%10; // To get the Last number
            Given_Number = Given_Number/10;
            if(Last_digit % 2==0 ){
                System.out.println("Even Number    "+Last_digit);
            }else {
                System.out.println("Odd Number     "+Last_digit);
            }
            sum = sum +Last_digit;

        }
        System.out.println(" count    "+count);
        System.out.println(" sum    "+sum);

    }
}
