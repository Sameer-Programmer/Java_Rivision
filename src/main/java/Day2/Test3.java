package Day2;

import java.util.Scanner;

/*
To print Fibannaci Series
Logic = 0 1 1 2 3
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the Number : ");
        double  range = scanner.nextDouble();


        int num1 = 0;
        int num2 = 1;
        System.out.print(num1+"   "+num2);

        for (int i = 1; i<= range; i++){
            int result = num1 +num2 ; // 1
            num1 = num2;        // now num 1 = 1
            num2 = result;        // now num2 = 1
            System.out.print("      "+result);
        }

        scanner.close();





    }
}
