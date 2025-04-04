package package_4_Arrays;

import java.util.Arrays;

public class Test7 {
    public static void main(String[] args) {
        int a[] = {11, 12, 1,1, 2, 3, 4, 5, 6, 7, 8, 4};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);  // it is a void method we can not store directly in any datatype it simply sorts in place

        System.out.println(Arrays.toString(a));
/*
in this what is Arrays
in which data type we can store  Arrays.sort(a);
in console after Arrays.toString(a) in which form the data is printed
 */
    }
}
