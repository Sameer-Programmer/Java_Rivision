package Package_Strings;

import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {
/*
    split() -> Split Method

    Purpose:
    --------
    To split a string into parts based on a given delimiter (separator).

    Use Case:
    ---------
    When you want to break a string into multiple substrings using a symbol or character.

    Syntax:
    -------
    String[] parts = originalString.split("delimiter");

    Example:
    --------
    String email = "abc123@gmail.com";
    String[] splitEmail = email.split("@");

    Output:
    -------
    splitEmail[0] => "abc123"
    splitEmail[1] => "gmail.com"

    Notes:
    ------
    - Returns an array of strings.
    - Delimiter can be any character like: @, ., ,, or even a space.
    // * % ^ & ( ) - you cannot use as delimiters
is partially incorrect. You can use those characters as delimiters in split() — but with a catch! ⚠️

These symbols (*, %, ^, &, (, ), -, etc.) are special characters in regular expressions (regex). Since split() internally uses regex, you need to escape them using double backslashes like this: \\*, \\%, \\(, etc.
*/
        String s = "abc123@gmail.com";
      //  System.out.println(s.split("@"));
        /*
        output = abc123 and gmail.com ;
        we have to store these two string in a single varible through data type arrays we can store
         */
        String e [] = s.split("@");
        for(String x : e){
            //System.out.print(x+"  ");
            System.out.println(x+"  ");
        }
//        System.out.println(e);
//        System.out.println(e[0]);
//        System.out.println(e[1]);
//        String e1 = Arrays.toString(s.split("@"));
//        System.out.println(e1);



    }
}
