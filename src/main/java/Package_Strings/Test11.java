package Package_Strings;

public class Test11 {
    public static void main(String[] args) {
        String ship = "W el  come"; // string
        String n1 = "";

        char ch [] = ship.toCharArray(); // character array
        System.out.println(ch);  // here string is now printed in  character array know

        for(char x : ch) {
            if(x != ' ') {

                n1 = n1+x;
            }

        }
        System.out.println(n1);
    }
}
