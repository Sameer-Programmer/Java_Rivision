package Day2;
/*
To Find Given number Even or Odd
 */


import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the Number : ");
        double  num1 = scanner.nextDouble();

        if(num1 % 2 ==0 ){
            System.out.println("Given number is Even  ");
        }else {
            System.out.println("Given number is Odd ");
        }


        scanner.close();

    }
}
