package Package_Strings;

public class Test14 {
    public static void main(String[] args) {
        // Goal To Reverse a String
        String s = "Wel come";
        String reverse = "";
        int length = s.length();
        char arr[] = s.toCharArray();


       /*

       System.out.println('W'+"");
        System.out.println('e'+"W");
        System.out.println('l'+"eW");
        System.out.println('c'+"leW");

        */

        for(char x: arr) {
            if(x != ' ') {
                System.out.print(x);
                reverse =  x+reverse;
            }
        }

        System.out.println("\n" + reverse);






    }
}
/*
spaces removed and print
string reveresed
 */