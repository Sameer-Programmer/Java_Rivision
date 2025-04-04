package Package_Assigments;

import java.util.Arrays;

public class Test11 {
    public static void main(String[] args) {
        int a[] = {6,5,7,8,3,10};
        int temp =0;

        for(int i= 0 ; i<a.length; i++ ){

            for( int j =0 ; j<a.length -i -1; j++){

                if(a[j] > a[j+1]) { // 6>5

                    temp = a[j + 1]; // 5 is  stored in glass c  --> j+1 got empty
                    a[j + 1] = a[j]; // j+1 filled with a[j] -->a[j] becomes empty
                    a[j] = temp; //a[j] filled with temp ;
                }

            }
        }

        System.out.println(Arrays.toString(a));

    }
}
