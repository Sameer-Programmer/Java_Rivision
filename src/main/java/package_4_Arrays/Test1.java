package package_4_Arrays;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6,7,8};

        int Arraylength = a.length;
        System.out.println(Arraylength);

        for(int i =0 ; i<Arraylength; i++){
            System.out.println(a[i]);
        }
        System.out.println("BELOW ");

        for(int container : a){
            System.out.println(container);
        }


    }
}
