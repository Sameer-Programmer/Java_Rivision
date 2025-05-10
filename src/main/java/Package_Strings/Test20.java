package Package_Strings;

import java.util.Arrays;

public class Test20 {
    public static void main(String[] args) {
        // Goal to count words in a String

        String s1 = "Java Programm";
        String [] s2 = s1.split("\\s");
        int size = s2.length;
        System.out.println(size+"  words");
        System.out.println(Arrays.toString(s2));
    }
}
