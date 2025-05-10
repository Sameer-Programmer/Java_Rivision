package NaveenReddy;

import java.util.Scanner;

public class Test14 {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Number num1");
             num1 = scanner.nextInt();
        System.out.println("Please Enter Number num2");
             num2 = scanner.nextInt();

        Caliculator caliculator = new Caliculator();
        caliculator.add(num1,num2);
        String info = caliculator.getinfo(4);
        System.out.println(info);

        scanner.close();



    }
}
