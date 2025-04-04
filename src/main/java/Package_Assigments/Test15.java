package Package_Assigments;

import java.util.Arrays;

public class Test15 {
    public static void main(String[] args) {
        // Agenda to print the array in the sorting order

        int a [] = {7,3,1,2,4,5,6};
        int temp;
        int size = a.length;

        for ( int i = 0; i<a.length; i++  ){
            for(int j =0;j<a.length-1;j++){
               if(a[j]>a[j+1]){  //7>3
                 temp = a[j+1];
                 a[j+1] = a[j];
                 a[j] = temp;
               }
            }
        }

        System.out.println(Arrays.toString(a));
        System.out.println(a[0]+"   smallest number");
        System.out.println(a[size-1]+"   largest");

    }
}
