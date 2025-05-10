package Package_Strings;

import java.util.Arrays;

public class Test17 {
    public static void main(String[] args) {
// Agenda remove white spaces and print in the reverse order

        String s = " Ap pl e";
        System.out.println(s+"            withSpaces");
        String s2 = s.trim();
        System.out.println(s2+"                       trim");
        String s3 = "";
        String s4 = "";
         char storage1 [] = s2.toCharArray();

      for(char x : storage1) {
          if(x != ' '){

              s3 = s3+x; // normal
              s4 = x+s4;  // reverse
          }
      }
        System.out.println(s3);

//      char storage2 [] =s3.toCharArray();
//      for(char y :storage2 ){
//          s4 = y+s4;
//      }
        System.out.println(s4);


    }
}
