package Package_Strings;

import java.util.Arrays;

public class Test8 {
    public static void main(String[] args) {
        // Agenda to print  the string with Multiple delimeter
        String s = "Apple Banana Carrot";
        String s1[] = s.split(" ");
        System.out.println(Arrays.toString(s1));
        for(String s2 :s1){
            System.out.println(s2);
        }
    }
}
