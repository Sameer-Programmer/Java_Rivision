package package_4_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {

        int a [] = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Hi User, Happy to Help you ");

        for(int i =0; i<a.length; i++){

            System.out.println("Enter the Array for the index "+i);
          a[i] = scanner.nextInt();
        }

        Arrays.sort(a);

        System.out.println(Arrays.toString(a));








    }
}
