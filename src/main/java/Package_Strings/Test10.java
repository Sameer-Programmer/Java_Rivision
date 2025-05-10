package Package_Strings;

public class Test10 {
    public static void main(String[] args) {
        String s = "MADAM";  // Obj 1
        String reverse = "";  // Obj 2
        int length =s.length();

        String ship = "W el  come";


        for(int i =length-1; i>=0; i--){
            reverse = reverse+s.charAt(i);
        }
        System.out.println(reverse);

      //  String result = (reverse.equals(originalString)) ? "Palindrome" :"Not Palindrome";
        String result = (reverse.equals(s)) ? "Palindrome" :"Not Palindrome";
        System.out.println(result);

        System.out.println(ship.trim());


    }
}
