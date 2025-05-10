package Day1;

import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {

        int a [] = {4,5,6,7,8,9,10};

        a[1] = 8;

        System.out.println(a[1]);
        System.out.println(Arrays.toString(a));
        System.out.println(a);


        for (int i = 0 ; i <a.length; i++){
            System.out.print(a[i]);
        }







    }
}
