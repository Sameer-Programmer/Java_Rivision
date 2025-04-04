package package_4_Arrays;

import java.util.Arrays;

public class Test8 {
    public static void main(String[] args) {
        int a[] = {11, 12, 1,1, 2, 3, 4, 5, 6, 7, 8, 4};
        String b[] = {"Sameer", "Imran", "Apple"};
        char c[] = {'B','Z','C'};
        double d[] = {11.2, 2.3, 3.4};
       
        Arrays.toString(a);
        Arrays.sort(a);

        Arrays.toString(b);
        Arrays.sort(b);

        Arrays.toString(c);
        Arrays.sort(c);

        Arrays.toString(d);
        Arrays.sort(d);
        
       
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
      
        
        
    }
}
