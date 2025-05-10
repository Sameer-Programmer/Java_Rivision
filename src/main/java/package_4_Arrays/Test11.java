package package_4_Arrays;

import java.util.Arrays;

public class Test11 {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6,7,8};

        for( int i = a.length-1 ; i>=0; i--){
            System.out.println(a[i]);
        }

        System.out.println(Arrays.toString(a));


    }
}
