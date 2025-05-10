package Day2;

import java.util.Scanner;

/*
To print Given Number is Prime or Not
Logic = prime means Reminder zero for 1 an itself
 */
public class Test2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the Number : ");
        double  num1 = scanner.nextDouble();
        int  count = 0;

        for(int i = 1; i<=num1; i++){
            if(num1 % i == 0){
                count = count +1;
            }
        }
        String result = (count == 2)? "Prime" : "Not Prime ";
        System.out.println(result);
        scanner.close();

    }
}
