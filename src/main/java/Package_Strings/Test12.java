package Package_Strings;


// Online Java Compiler
// Use this editor to write, compile and run your Java code online

 public class Test12 {
    public static void main(String[] args) {
        // Agenda To remove White Spaces and reverse the String
        String s1 = "Sameer Bhai";
        char ch [] = s1.toCharArray();
        String reverse = "";
        char last = 0;


        for(char x : ch){
            if(x != ' ') {
                reverse = x + reverse;

            }

            System.out.println(reverse);
        }
        System.out.println(reverse);
       // System.out.println(x);

    }
}